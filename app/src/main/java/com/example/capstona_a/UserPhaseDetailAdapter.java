package com.example.capstona_a;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.CParticipant;

import java.util.ArrayList;

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
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("UserPhaseDetailAdapter", position + " getView()");
        View cv = convertView;
        UserPhaseDetailAdapterViewHolder NowVH;
        if (cv == null) {
            Log.d("UserPhaseDetailAdapter3", position + " v=null");
            cv = myInflater.inflate(R.layout.listview_user_phase_detail_single, parent, false);
            NowVH = new UserPhaseDetailAdapterViewHolder();
            viewBind(cv, NowVH);
            cv.setTag(NowVH);
        } else {
            Log.d("UserPhaseDetailAdapter3", position + " v 는 가져옴");
            NowVH = (UserPhaseDetailAdapterViewHolder) cv.getTag();
        }


        String champName = Util.changeChampionIdToName(data.get(position).getChampionId());
        Glide.with(myContext).load(Util.getChampImgSrc(champName, 0)).circleCrop().into(NowVH.imageChamp);
        Long item_0 = data.get(position).getStats().getItem0();
        Long item_1 = data.get(position).getStats().getItem1();
        Long item_2 = data.get(position).getStats().getItem2();
        Long item_3 = data.get(position).getStats().getItem3();
        Long item_4 = data.get(position).getStats().getItem4();
        Long item_5 = data.get(position).getStats().getItem5();
        Long spell_1 = data.get(position).getSpell1Id();
        Long spell_2 = data.get(position).getSpell2Id();
        Long[] listImageSrc = {item_0, item_1, item_2, item_3, item_4, item_5, spell_1, spell_2};
        ImageView[] listItemImageView = {NowVH.imageItem0, NowVH.imageItem1, NowVH.imageItem2, NowVH.imageItem3, NowVH.imageItem3, NowVH.imageItem4, NowVH.imageItem5};
        for (int i = 0; i < listImageSrc.length - 1; i++) {
            glideItemImgSet(myContext, listItemImageView[i], listImageSrc[i]);
        }
        NowVH.text_User.setText(data.get(position).getUsername());
        int cs = data.get(position).getStats().getTotalMinionsKilled().intValue();
        NowVH.text_cs.setText(cs + "(cs)");
        NowVH.text_kda.setText(data.get(position).getStats().getKills().toString() + "/" + data.get(position).getStats().getDeaths().toString() + "/" + data.get(position).getStats().getAssists().toString());


        return cv;


    }

    private void glideItemImgSet(Context context, ImageView view, Long item) {
        Glide.with(context).load(Util.getItemImgSrc(item)).into(view);
    }

    private void viewBind(View convertView, UserPhaseDetailAdapterViewHolder VH) {
        VH.imageChamp = convertView.findViewById(R.id.img_userphase_Champ);
        VH.imageSpell1 = convertView.findViewById(R.id.img_user_phase_detail_spell1);
        VH.imageSpell2 = convertView.findViewById(R.id.img_user_phase_detail_spell2);
        VH.imageRune1 = convertView.findViewById(R.id.img_user_phase_detail_rune1);
        VH.imageRune2 = convertView.findViewById(R.id.img_user_phase_detail_rune2);
        VH.imagesTier = convertView.findViewById(R.id.img_user_phase_detail_tier);
        VH.imageItem0 = convertView.findViewById(R.id.img_user_phase_detail_Item0);
        VH.imageItem1 = convertView.findViewById(R.id.img_user_phase_detail_Item1);
        VH.imageItem2 = convertView.findViewById(R.id.img_user_phase_detail_Item2);
        VH.imageItem3 = convertView.findViewById(R.id.img_user_phase_detail_Item3);
        VH.imageItem4 = convertView.findViewById(R.id.img_user_phase_detail_Item4);
        VH.imageItem5 = convertView.findViewById(R.id.img_user_phase_detail_Item5);
        VH.text_User = convertView.findViewById(R.id.text_user_phase_detail_name);
        VH.text_cs = convertView.findViewById(R.id.text_user_phase_detail_cs);
        VH.text_tierName = convertView.findViewById(R.id.text_user_phase_detail_tiername);
        VH.text_kda = convertView.findViewById(R.id.text_user_phase_detail_kda);


    }

}

class UserPhaseDetailAdapterViewHolder {
    ImageView imageChamp;
    ImageView imageSpell1;
    ImageView imageSpell2;
    ImageView imageRune1;
    ImageView imageRune2;
    ImageView imagesTier;
    ImageView imageItem0;
    ImageView imageItem1;
    ImageView imageItem2;
    ImageView imageItem3;
    ImageView imageItem4;
    ImageView imageItem5;
    TextView text_User;
    TextView text_cs;
    TextView text_tierName;
    TextView text_kda;


}
