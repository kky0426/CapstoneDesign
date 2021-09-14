package com.example.capstona_a;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.Ingame;
import com.example.capstona_a.data.Player;

import java.util.ArrayList;
import java.util.List;

public class IngameAdapter extends BaseAdapter {



    private final Context Mycontext;
    private final LayoutInflater inflater;
    private final List<Player> player;

    public IngameAdapter(Context context, List<Player> data) {
        Mycontext = context;
        player = data;
        inflater = LayoutInflater.from(Mycontext);
    }
    @Override
    public int getCount() { return player.size(); }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Player getItem(int position) {
        return player.get(position);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
            Log.d("IngameAdapter", position + " getView()");
            View convertview=v;
            IngameViewHolder CurrentVH;
            if(convertview==null){
                Log.d("IngameAdapter1",position+"v=null");
                convertview=inflater.inflate(R.layout.listview_ingame_single,parent,false);
                CurrentVH=new IngameViewHolder();
                viewBinding(convertview,CurrentVH);
                convertview.setTag(CurrentVH);


            }else {
                Log.d("IngameAdapter2", position + "v check");
                CurrentVH = (IngameViewHolder) convertview.getTag();
            }

            int champid =Integer.valueOf(player.get(position).champIdtoString());

            //챔프 이미지
            String champcode=Util.changeChampionIdToName(champid);
            String champUrl=Util.getChampImgSrc(champcode,0);
            Glide.with(Mycontext).load(champUrl).into(CurrentVH.ingame_champ);
            //
            //스펠
            SpellHold(CurrentVH,Mycontext,position);
            //

            //룬
            TextHold(CurrentVH,player,position);



            return convertview;

    }
    private void SpellHold(IngameViewHolder CurrentVH,Context context,int position){
        int spell1=Integer.valueOf(player.get(position).Spell1toString());
        String spell1_a=Util.changeSpellcodetoSpellName(spell1);
        String Spell1=Util.getSpellImgSrc(spell1_a);
        Glide.with(context).load(Spell1).into(CurrentVH.ingame_spell1);
        int spell2=Integer.valueOf(player.get(position).Spell2toString());
        String spell2_a=Util.changeSpellcodetoSpellName(spell2);
        String Spell2=Util.getSpellImgSrc(spell2_a);
        Glide.with(context).load(Spell2).into(CurrentVH.ingame_spell2);

    }
    private void TextHold(IngameViewHolder CurrentVH,List<Player>player,int position){
        CurrentVH.ingame_name.setText(player.get(position).nametoString());
        //CurrentVH.ingame_tier_name.setText(player.get(position).); //TODO 여기 레트로핏 연동해야 될듯
        CurrentVH.ingame_kda.setText(player.get(position).getavgStats().KillDeathAssisttoString());
        CurrentVH.ingame_vision.setText(String.valueOf(Math.floor(player.get(position).getavgStats().getVision())));
        CurrentVH.ingame_gold.setText(String.valueOf(Math.floor(player.get(position).getavgStats().getGold())));
        CurrentVH.ingame_damage_taken.setText(String.valueOf(Math.floor(player.get(position).getavgStats().getDamageTaken())));
        CurrentVH.ingame_damage_dealt.setText(String.valueOf(Math.floor(player.get(position).getavgStats().getDamageDealt())));
        CurrentVH.ingame_exp.setText(String.valueOf(Math.floor(player.get(position).getavgStats().getExp())));

    }

    private void viewBinding(View v, IngameViewHolder currentVH) {
        currentVH.ingame_champ = v.findViewById(R.id.img_ingame_champ);
        currentVH.ingame_spell1 = v.findViewById(R.id.img_ingame_spell1);
        currentVH.ingame_spell2 = v.findViewById(R.id.img_ingame_spell2);
        currentVH.ingame_tier = v.findViewById(R.id.img_ingame_tier);
        currentVH.ingame_name = v.findViewById(R.id.tv_ingame_name);
        currentVH.ingame_tier_name = v.findViewById(R.id.tv_ingame_tier);
        currentVH.ingame_kda = v.findViewById(R.id.ingame_kda);
        currentVH.ingame_damage_dealt = v.findViewById(R.id.ingame_damage_dealt);
        currentVH.ingame_damage_taken = v.findViewById(R.id.ingame_damage_taken);
        currentVH.ingame_gold=v.findViewById(R.id.ingame_gold);
        currentVH.ingame_exp=v.findViewById(R.id.ingame_exp);
        currentVH.ingame_vision=v.findViewById(R.id.ingame_vision);
    }




}

class IngameViewHolder{
    ImageView ingame_champ;
    ImageView ingame_spell1;
    ImageView ingame_spell2;
    ImageView ingame_rune1;
    ImageView ingame_rune2;
    ImageView ingame_tier;
    TextView ingame_name;
    TextView ingame_tier_name;
    TextView ingame_kda;
    TextView ingame_damage_dealt;
    TextView ingame_damage_taken;
    TextView ingame_gold;
    TextView ingame_exp;
    TextView ingame_vision;


}
