package com.example.capstona_a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseAdapter extends BaseAdapter {
    Message msg;
    Context myContext = null;
    LayoutInflater myInflater = null;
    ArrayList<CMatch> Cmatch;
    String api_key="RGAPI-d98dcf8f-04bb-4516-a455-0f302548115e";
    int HourDuration=0;
    int MinuteDuration=0;
    int playernum=0;
    String item_0=null;
    String item_1=null;
    String item_2=null;
    String item_3=null;
    String item_4=null;
    String item_5=null;
    ImageView item0;
    ImageView item1;
    ImageView item2;
    ImageView item3;
    ImageView item4;
    ImageView item5;
    boolean flag;
    final static String foldername= Environment.getExternalStorageDirectory().getAbsolutePath()+"/ItemCode";
    final static String filename="Itemcode.txt";


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
        item0=(ImageView)view.findViewById(R.id.Item0);
        item1=(ImageView)view.findViewById(R.id.Item1);
        item2=(ImageView)view.findViewById(R.id.Item2);
        item3=(ImageView)view.findViewById(R.id.Item3);
        item4=(ImageView)view.findViewById(R.id.Item4);
        item5=(ImageView)view.findViewById(R.id.Item5);
        TextView gameduration=(TextView)view.findViewById(R.id.gameDuration);
        Glide.with(imageView).load(Cmatch.get(position).getImgSrc()).into(imageView);
        flag=true;
        Call<CMatchDetailDTO>matchDetailDTOCall=RetroMatchBuild.getInstance2().getService().getMatchDetail(Cmatch.get(position).getGameId().toString(),api_key);
        Thread GetMatchDetail = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    CMatchDetailDTO dto = matchDetailDTOCall.execute().body();
                    dto.Activateplayernum(Cmatch.get(position).getName());
                    item_0 = String.valueOf(dto.getParticipants().get(dto.getPlayernum()).getStats().getItem0());
                    item_1 = String.valueOf(dto.getParticipants().get(dto.getPlayernum()).getStats().getItem1());
                    item_2 = String.valueOf(dto.getParticipants().get(dto.getPlayernum()).getStats().getItem2());
                    item_3 = String.valueOf(dto.getParticipants().get(dto.getPlayernum()).getStats().getItem3());
                    item_4 = String.valueOf(dto.getParticipants().get(dto.getPlayernum()).getStats().getItem4());
                    item_5 = String.valueOf(dto.getParticipants().get(dto.getPlayernum()).getStats().getItem5());
                    int playernum = dto.getPlayernum();
                    double kill = (double) dto.getParticipants().get(playernum).getStats().getKills();
                    double death = (double) dto.getParticipants().get(playernum).getStats().getDeaths();
                    double assist = (double) dto.getParticipants().get(playernum).getStats().getAssists();
                    String k_d_a = String.valueOf((int) kill) + "/" + String.valueOf((int) death) + "/" + String.valueOf((int) assist);
                    String aver = String.format("%.2f", (kill + assist) / death);
                    champname.setText(Cmatch.get(position).getChampName());
                    Log.d("timeduration", dto.getGameDuration().toString());
                    kda.setText(k_d_a);
                    average.setText(aver);
                    gameduration.setText(String.valueOf(dto.getGameDuration() / 60) + "분" + String.valueOf(dto.getGameDuration() % 60) + "초");
                    String path=getUrlfromRdrawable(R.drawable.item_6693);
                    Log.d("g",path);
                    ////
                    String PATH0="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+item_0+".png";
                    URL url0 = new URL(PATH0);
                    URLConnection conn0 = url0.openConnection();
                    conn0.connect();
                    InputStream stream0 = conn0.getInputStream();
                    Bitmap bitmap0 = BitmapFactory.decodeStream(stream0);
                    item0.setImageBitmap(bitmap0);
                    /////
                    ////
                    String PATH1="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+item_1+".png";
                    URL url1 = new URL(PATH1);
                    URLConnection conn1 = url1.openConnection();
                    conn1.connect();
                    InputStream stream1 = conn1.getInputStream();
                    Bitmap bitmap1 = BitmapFactory.decodeStream(stream1);
                    item1.setImageBitmap(bitmap1);
                    /////
                    ////
                    String PATH2="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+item_2+".png";
                    URL url2 = new URL(PATH2);
                    URLConnection conn2 = url2.openConnection();
                    conn2.connect();
                    InputStream stream2 = conn2.getInputStream();
                    Bitmap bitmap2 = BitmapFactory.decodeStream(stream2);
                    item2.setImageBitmap(bitmap2);
                    /////
                    ////
                    String PATH3="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+item_3+".png";
                    URL url3 = new URL(PATH3);
                    URLConnection conn3 = url3.openConnection();
                    conn3.connect();
                    InputStream stream3 = conn3.getInputStream();
                    Bitmap bitmap3 = BitmapFactory.decodeStream(stream3);
                    item3.setImageBitmap(bitmap3);
                    /////
                    ////
                    String PATH4="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+item_4+".png";
                    URL url4 = new URL(PATH4);
                    URLConnection conn4 = url4.openConnection();
                    conn4.connect();
                    InputStream stream4 = conn4.getInputStream();
                    Bitmap bitmap4 = BitmapFactory.decodeStream(stream4);
                    item4.setImageBitmap(bitmap4);
                    /////
                    ////
                    String PATH5="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+item_5+".png";
                    URL url5 = new URL(PATH5);
                    URLConnection conn5 = url5.openConnection();
                    conn5.connect();
                    InputStream stream5 = conn5.getInputStream();
                    Bitmap bitmap5 = BitmapFactory.decodeStream(stream5);
                    item5.setImageBitmap(bitmap5);
                    /////




                    }catch (IOException e){

                    }
                }

        });
        GetMatchDetail.start();
        try{
            GetMatchDetail.join();
        }catch (Exception e){

        }









        //gameduration.setText(Integer.toString(HourDuration)+"분 "+Integer.toString(MinuteDuration)+"초");
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


                Glide.with(item0).load("https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem1().toString()+".png");
                Glide.with(item1).load("https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem2().toString()+".png");
                Glide.with(item2).load("https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem3().toString()+".png");
                Glide.with(item3).load("https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem4().toString()+".png");
                Glide.with(item4).load("https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem5().toString()+".png");
                Glide.with(item5).load("https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+dto.getParticipants().get(playernum).getStats().getItem6().toString()+".png");

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
    String getItemUrl(String itemnum)
    {
        String src="https://ddragon.leagueoflegends.com/cdn/11.15.1/img/item/"+itemnum+".png";
        return src;
    }
    String getUrlfromRdrawable(int resId){
        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resId).toString();
    }







}

