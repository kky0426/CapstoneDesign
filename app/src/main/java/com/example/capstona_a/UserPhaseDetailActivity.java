package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstona_a.data.CMatchDetailDTO;
import com.example.capstona_a.data.CParticipant;

import java.util.ArrayList;

public class UserPhaseDetailActivity extends AppCompatActivity {

    private ListView Red;
    private ListView Blue;
    private TextView winTeam;
    private TextView redKDA_avg;
    private TextView blueKDA_avg;
    private TextView firstBlood;
    private TextView firstTower;
    private static int winTeam_var;
    private static int firstTower_var;
    private static int firstBlood_var;
    private static int redKA_var=0,redD_var=0;
    private static int blueKA_var=0,blueD_var=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase_detail);

        Intent intent = getIntent();
        CMatchDetailDTO dto = (CMatchDetailDTO) intent.getSerializableExtra("GameData");
        dto.activateUsername();
        ArrayList<CParticipant> redParticipants = new ArrayList<>();
        ArrayList<CParticipant> blueParticipants = new ArrayList<>();
        viewBinding();
        int k = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            CalgameInfo(dto,i);
            if (dto.getParticipants().get(i).getTeamId() == 100) {
                redParticipants.add(j, dto.getParticipants().get(i));
                j++;
            } else {
                blueParticipants.add(k, dto.getParticipants().get(i));
                k++;
            }

        }
        final UserPhaseDetailAdapter redDetailAdapter = new UserPhaseDetailAdapter(getApplicationContext(), redParticipants);
        final UserPhaseDetailAdapter blueDetailAdapter = new UserPhaseDetailAdapter(getApplicationContext(), blueParticipants);
        Red.setAdapter(redDetailAdapter);
        Blue.setAdapter(blueDetailAdapter);
        SetgameInfo();

    }

    private void viewBinding(){
        Red = findViewById(R.id.listview_red_team);
        Blue = findViewById(R.id.listview_blue_team);
        winTeam = findViewById(R.id.textview_winteam);
        redKDA_avg= findViewById(R.id.KDA_red_team);
        blueKDA_avg= findViewById(R.id.KDA_blue_team);
        firstBlood=findViewById(R.id.textview_firstblood);
        firstTower=findViewById(R.id.textview_firsttower);
    }

    private void CalgameInfo(CMatchDetailDTO dto,int i){
        if(dto.getParticipants().get(i).getTeamId() == 100) {
            if (dto.getParticipants().get(i).getStats().getWin())
                winTeam_var = 100;
            if (dto.getParticipants().get(i).getStats().getFirstTowerKill())
                firstTower_var = 100;
            if (dto.getParticipants().get(i).getStats().getFirstBloodKill())
                firstBlood_var = 100;
            redKA_var+=(dto.getParticipants().get(i).getStats().getKills().intValue()+dto.getParticipants().get(i).getStats().getAssists().intValue());
            redD_var+=dto.getParticipants().get(i).getStats().getDeaths().intValue();
        }
        else if(dto.getParticipants().get(i).getTeamId() == 200) {
            if (dto.getParticipants().get(i).getStats().getWin())
                winTeam_var = 200;
            if (dto.getParticipants().get(i).getStats().getFirstTowerKill())
                firstTower_var = 200;
            if (dto.getParticipants().get(i).getStats().getFirstBloodKill())
                firstBlood_var = 200;
            blueKA_var+=(dto.getParticipants().get(i).getStats().getKills().intValue()+dto.getParticipants().get(i).getStats().getAssists().intValue());
            blueD_var+=dto.getParticipants().get(i).getStats().getDeaths().intValue();
        }
    }

    private void SetgameInfo(){
        if(winTeam_var==100){ winTeam.setText("레드"); winTeam.setTextColor(0xAAeF484a);}
        if(winTeam_var==200){ winTeam.setText("블루"); winTeam.setTextColor(0xAA1e6de0);}
        if(firstBlood_var==100){ firstBlood.setText("First Blood: 레드"); firstBlood.setTextColor(0xAAeF484a);}
        if(firstBlood_var==200){ firstBlood.setText("First Blood: 블루"); firstBlood.setTextColor(0xAA1e6de0);}
        if(firstTower_var==100){ firstTower.setText("First Tower: 레드"); firstTower.setTextColor(0xAAeF484a);}
        if(firstTower_var==200){ firstTower.setText("First Tower: 블루"); firstTower.setTextColor(0xAA1e6de0);}
        redKDA_avg.setText(String.format("%.2f",(float) redKA_var / redD_var)); redKDA_avg.setTextColor(0xAAeF484a);
        blueKDA_avg.setText(String.format("%.2f",(float) blueKA_var / blueD_var)); blueKDA_avg.setTextColor(0xAA1e6de0);
    }

}