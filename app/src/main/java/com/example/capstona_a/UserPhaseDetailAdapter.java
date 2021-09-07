package com.example.capstona_a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.CMatchDetailDTO;
import com.example.capstona_a.data.CParticipant;
import com.example.capstona_a.retrofit.RetroMatchBuild;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPhaseDetailAdapter extends BaseAdapter {
    private final Context myContext;
    private final LayoutInflater myInflater;
    private final ArrayList<CParticipant> data;

    public UserPhaseDetailAdapter(Context context, ArrayList<CParticipant> participants) {
        myContext = context;
        data = participants;
        myInflater = LayoutInflater.from(myContext);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public CParticipant getItem(int position) {
        return data.get(position);
    }

    @Override
    public View getView(int position, View converview, ViewGroup parent) {
        Log.d("UserPhasedetailAdapter", position + " getView()");
        View convertView = converview;
        UserPhaseDetailAdapterViewHolder NowVH;
        if (convertView == null) {
            Log.d("UserPhasedetailAdapter3", position + " v=null");
            convertView = myInflater.inflate(R.layout.listview_user_phase_detail_single, parent, false);
            NowVH = new UserPhaseDetailAdapterViewHolder();
            viewBind(convertView, NowVH);
            convertView.setTag(NowVH);
        } else {
            Log.d("UserPhasedetailAdapter3", position + " v 는 가져옴");
            NowVH = (UserPhaseDetailAdapterViewHolder) convertView.getTag();
        }


        String champname = Util.changeChampionIdToName(data.get(position).getChampionId());
        Glide.with(myContext).load(Util.getChampImgSrc(champname, 0)).circleCrop().into(NowVH.imagechamp);
        Long item_0 = data.get(position).getStats().getItem0();
        Long item_1 = data.get(position).getStats().getItem1();
        Long item_2 = data.get(position).getStats().getItem2();
        Long item_3 = data.get(position).getStats().getItem3();
        Long item_4 = data.get(position).getStats().getItem4();
        Long item_5 = data.get(position).getStats().getItem5();
        Long spell_1 = data.get(position).getSpell1Id();
        Long spell_2 = data.get(position).getSpell2Id();
        Long[] ListimageSrc={item_0,item_1,item_2,item_3,item_4,item_5,spell_1,spell_2};
        ImageView[] ListitemimageView={NowVH.imageitem0, NowVH.imageitem1, NowVH.imageitem2, NowVH.imageitem3, NowVH.imageitem3, NowVH.imageitem4, NowVH.imageitem5};
        for(int i =0; i<ListimageSrc.length-1;i++){
            GlideitemimgSet(myContext,ListitemimageView[i],ListimageSrc[i]);
        }
        NowVH.text_User.setText(data.get(position).getUsername());
        int cs = data.get(position).getStats().getTotalMinionsKilled().intValue();
        NowVH.text_cs.setText(String.valueOf(cs) + "(cs)");
        NowVH.text_kda.setText(data.get(position).getStats().getKills().toString() + "/" + data.get(position).getStats().getDeaths().toString() + "/" + data.get(position).getStats().getAssists().toString());



        return convertView;






    }
    private void GlideitemimgSet(Context context,ImageView view,Long item){
        Glide.with(context).load(Util.getItemImgSrc(item)).into(view);
    }
    private void viewBind(View converView, UserPhaseDetailAdapterViewHolder VH){
        VH.imagechamp=converView.findViewById(R.id.img_userphase_Champ);
        VH.imagespell1 = converView.findViewById(R.id.img_user_phase_detail_spell1);
        VH.imagespell2 = converView.findViewById(R.id.img_user_phase_detail_spell2);
        VH.imagerune1 = converView.findViewById(R.id.img_user_phase_detail_rune1);
        VH.imagerune2 = converView.findViewById(R.id.img_user_phase_detail_rune2);
        VH.imagestier = converView.findViewById(R.id.img_user_phase_detail_tier);
        VH.imageitem0 = converView.findViewById(R.id.img_user_phase_detail_Item0);
        VH.imageitem1 = converView.findViewById(R.id.img_user_phase_detail_Item1);
        VH.imageitem2 = converView.findViewById(R.id.img_user_phase_detail_Item2);
        VH.imageitem3 = converView.findViewById(R.id.img_user_phase_detail_Item3);
        VH.imageitem4 = converView.findViewById(R.id.img_user_phase_detail_Item4);
        VH.imageitem5 = converView.findViewById(R.id.img_user_phase_detail_Item5);
        VH.text_User = converView.findViewById(R.id.text_user_phase_detail_name);
        VH.text_cs = converView.findViewById(R.id.text_user_phase_detail_cs);
        VH.text_tiername = converView.findViewById(R.id.text_user_phase_detail_tiername);
        VH.text_kda = converView.findViewById(R.id.text_user_phase_detail_kda);


    }

}
class   UserPhaseDetailAdapterViewHolder{
    ImageView imagechamp;
    ImageView imagespell1;
    ImageView imagespell2;
    ImageView imagerune1;
    ImageView imagerune2;
    ImageView imagestier;
    ImageView imageitem0;
    ImageView imageitem1;
    ImageView imageitem2;
    ImageView imageitem3;
    ImageView imageitem4;
    ImageView imageitem5;
    TextView text_User;
    TextView text_cs;
    TextView text_tiername;
    TextView text_kda;


}
