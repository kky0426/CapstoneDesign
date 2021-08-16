package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UserphaseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userphase_detail);
        Intent intent = getIntent();
        CMatchDetailDTO dto=(CMatchDetailDTO)intent.getSerializableExtra("GameData");
        ArrayList<ArrayList<String>>list=new ArrayList<ArrayList<String>>();
        list=Classify_Team(dto);
        Toast.makeText(getApplicationContext(),list.get(0).get(0),Toast.LENGTH_SHORT);




    }
    ArrayList<ArrayList<String>>Classify_Team(CMatchDetailDTO dto){
        ArrayList<ArrayList<String>>list=new ArrayList<ArrayList<String>>();
        ArrayList<String>team100=null;
        ArrayList<String>team200=null;
        for(int i=0; i<10;i++) {
            if (dto.getParticipants().get(i).getTeamId() == 100) {
                team100.add(dto.getParticipantIdentities().get(i).getPlayer().getSummonerName());
            } else {
                team200.add(dto.getParticipantIdentities().get(i).getPlayer().getSummonerName());
            }
        }
        list.add(team100);
        list.add(team200);
        return list;
    }


}