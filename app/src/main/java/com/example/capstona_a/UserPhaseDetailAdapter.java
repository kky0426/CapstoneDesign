package com.example.capstona_a;

import android.content.Context;
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
    public View getView(int position, View converview, ViewGroup parent) {
        View view = myInflater.inflate(R.layout.listview_user_phase_detail_single, parent, false);
        ImageView imagechamp = (ImageView) view.findViewById(R.id.img_userphase_Champ);
        ImageView imagespell1 = (ImageView) view.findViewById(R.id.img_user_phase_detail_spell1);
        ImageView imagespell2 = (ImageView) view.findViewById(R.id.img_user_phase_detail_spell2);
        ImageView imagerune1 = (ImageView) view.findViewById(R.id.img_user_phase_detail_rune1);
        ImageView imagerune2 = (ImageView) view.findViewById(R.id.img_user_phase_detail_rune2);
        ImageView imagestier = (ImageView) view.findViewById(R.id.img_user_phase_detail_tier);
        ImageView imageitem0 = (ImageView) view.findViewById(R.id.img_user_phase_detail_Item0);
        ImageView imageitem1 = (ImageView) view.findViewById(R.id.img_user_phase_detail_Item1);
        ImageView imageitem2 = (ImageView) view.findViewById(R.id.img_user_phase_detail_Item2);
        ImageView imageitem3 = (ImageView) view.findViewById(R.id.img_user_phase_detail_Item3);
        ImageView imageitem4 = (ImageView) view.findViewById(R.id.img_user_phase_detail_Item4);
        ImageView imageitem5 = (ImageView) view.findViewById(R.id.img_user_phase_detail_Item5);
        TextView text_User = (TextView) view.findViewById(R.id.text_user_phase_detail_name);
        TextView text_cs = (TextView) view.findViewById(R.id.text_user_phase_detail_cs);
        TextView text_tiername = (TextView) view.findViewById(R.id.text_user_phase_detail_tiername);
        TextView text_kda = (TextView) view.findViewById(R.id.text_user_phase_detail_kda);
        String champname = Util.changeChampionIdToName(data.get(position).getChampionId());
        Glide.with(myContext).load(Util.getChampImgSrc(champname, 0)).circleCrop().into(imagechamp);

        Long item_0 = data.get(position).getStats().getItem0();
        Long item_1 = data.get(position).getStats().getItem1();
        Long item_2 = data.get(position).getStats().getItem2();
        Long item_3 = data.get(position).getStats().getItem3();
        Long item_4 = data.get(position).getStats().getItem4();
        Long item_5 = data.get(position).getStats().getItem5();
        Long spell_1 = data.get(position).getSpell1Id();
        Long spell_2 = data.get(position).getSpell2Id();
        Glide.with(myContext).load(Util.getItemImgSrc(item_0)).into(imageitem0);
        Glide.with(myContext).load(Util.getItemImgSrc(item_1)).into(imageitem1);
        Glide.with(myContext).load(Util.getItemImgSrc(item_2)).into(imageitem2);
        Glide.with(myContext).load(Util.getItemImgSrc(item_3)).into(imageitem3);
        Glide.with(myContext).load(Util.getItemImgSrc(item_4)).into(imageitem4);
        Glide.with(myContext).load(Util.getItemImgSrc(item_5)).into(imageitem5);
        Glide.with(myContext).load(Util.getSpellImgSrc(spell_1)).into(imagespell1);
        Glide.with(myContext).load(Util.getSpellImgSrc(spell_2)).into(imagespell2);
        text_User.setText(data.get(position).getUsername());
        int cs = data.get(position).getStats().getTotalMinionsKilled().intValue();
        text_cs.setText(String.valueOf(cs) + "(cs)");
        text_kda.setText(data.get(position).getStats().getKills().toString() + "/" + data.get(position).getStats().getDeaths().toString() + "/" + data.get(position).getStats().getAssists().toString());

        return view;

    }
}
