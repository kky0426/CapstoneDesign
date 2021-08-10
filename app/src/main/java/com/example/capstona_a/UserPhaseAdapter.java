package com.example.capstona_a;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseAdapter extends BaseAdapter{
    Context myContext = null;
    LayoutInflater myInflater = null;
    ArrayList<CMatch> Cmatch;
    String api_key="RGAPI-d98dcf8f-04bb-4516-a455-0f302548115e";

    public UserPhaseAdapter(Context context, ArrayList<CMatch> data){
        myContext = context;
        Cmatch = data;
        myInflater = LayoutInflater.from(myContext);
    }
    @Override
    public int getCount(){
        return Cmatch.size();
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public CMatch getItem(int position)
    {
        return Cmatch.get(position);
    }
    @Override
    public View getView(int position, View converView, ViewGroup parent)
    {
        View view = myInflater.inflate(R.layout.listview_userphase_single, null);
        ImageView imageView = (ImageView)view.findViewById(R.id.img_recordchamp);
        TextView champname=(TextView)view.findViewById(R.id.name_champ);
        TextView kda=(TextView)view.findViewById(R.id.record_kda);
        TextView average = (TextView)view.findViewById(R.id.record_average);
        ImageView item1=(ImageView)view.findViewById(R.id.Item1);
        ImageView item2=(ImageView)view.findViewById(R.id.Item2);
        ImageView item3=(ImageView)view.findViewById(R.id.Item3);
        ImageView item4=(ImageView)view.findViewById(R.id.Item4);
        ImageView item5=(ImageView)view.findViewById(R.id.Item5);
        ImageView item6=(ImageView)view.findViewById(R.id.Item6);
        TextView gameduration=(TextView)view.findViewById(R.id.gameDuration);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Call<CMatchDetailDTO> res3=RetroMatchBuild.getInstance2().getService().getMatchDetail(Cmatch.get(position).getGameId().toString(),api_key);
                try {
                    CMatchDetailDTO dto=res3.execute().body();
                    champname.setText(Cmatch.get(position).getChampName());
                    int playernum=getPlayernum(dto,Cmatch.get(position).getAccountId());
                    kda.setText(" "+ dto.getParticipants().get(playernum).getStats().getKills().toString()+" / "+dto.getParticipants().get(playernum).getStats().getDeaths().toString()+" / "+dto.getParticipants().get(playernum).getStats().getAssists().toString());
                    average.setText(" "+String.valueOf((dto.getParticipants().get(playernum).getStats().getKills()+dto.getParticipants().get(playernum).getStats().getAssists())/dto.getParticipants().get(playernum).getStats().getDeaths()));

                    int Duration=dto.getGameDuration().intValue();
                    int HourDuration=Duration/100;
                    int MinuteDuration=Duration%100;
                    gameduration.setText(Integer.toString(HourDuration)+"분 "+Integer.toString(MinuteDuration)+"초");
                }catch(IOException e){
                    System.out.println(res3.clone());
                }

            }
        }).start();
        Glide.with(imageView).load(Cmatch.get(position).getImgSrc()).into(imageView);
        /*
        res3.enqueue(new Callback<CMatchDetailDTO>() {
            @Override
            public void onResponse(Call<CMatchDetailDTO> call, Response<CMatchDetailDTO> response) {
                Log.d("retrofit success","matchdetail Success");
                CMatchDetailDTO dto= response.body();

                int playernum=getPlayernum(dto,Cmatch.get(position).getAccountId());
                String k = String.valueOf(playernum);
                Toast.makeText(myContext.getApplicationContext(),k,Toast.LENGTH_SHORT).show();
                Glide.with(imageView).load(Cmatch.get(position).getImgSrc()).into(imageView);
                champname.setText(Cmatch.get(position).getChampName());


                Glide.with(item1).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem1().toString()+".png");
                Glide.with(item2).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem2().toString()+".png");
                Glide.with(item3).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem3().toString()+".png");
                Glide.with(item4).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem4().toString()+".png");
                Glide.with(item5).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem5().toString()+".png");
                Glide.with(item6).load("https://ddragon.leagueoflegends.com/cdn/10.11.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem6().toString()+".png");

                try{
                    SystemClock.sleep(1000);
                }finally {

                }

            }

            @Override
            public void onFailure(Call<CMatchDetailDTO> call, Throwable t) {

            }
        });*/

        //kda.setText(" "+ Cusprintdata.get(position).getKill().toString()+" / "+Cusprintdata.get(position).getDeaths().toString()+" / "+Cusprintdata.get(position).getAssist().toString());
        //average.setText(" "+Cusprintdata.get(position).getAverage().toString());

//        int Duration=Cusprintdata.get(position).getGameDuration().intValue();
//        int HourDuration=Duration/100;
//        int MinuteDuration=Duration%100;
//        gameduration.setText(Integer.toString(HourDuration)+"분 "+Integer.toString(MinuteDuration)+"초");

        return view;

    }
    int getPlayernum(CMatchDetailDTO dto,String accountId){
        int playernum=0;
        for(int i =0; i<10; i++)
        {
            if(dto.getParticipantIdentities().get(i).getPlayer().getAccountId()==accountId){
                playernum=i;
                return playernum;
            }
        }

        return 0;
    }


}
