package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstona_a.data.CMatchDetailDTO;
import com.example.capstona_a.data.CParticipant;

import java.util.ArrayList;

public class UserPhaseDetailActivity extends AppCompatActivity {

    public static Long win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase_detail);

        Intent intent = getIntent();
        CMatchDetailDTO dto = (CMatchDetailDTO) intent.getSerializableExtra("GameData");
        dto.activateUsername();
        ArrayList<CParticipant> redParticipants = new ArrayList<>();
        ArrayList<CParticipant> blueParticipants = new ArrayList<>();
        ListView Red = findViewById(R.id.listview_red_team);
        ListView Blue = findViewById(R.id.listview_blue_team);
        int k = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
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


    }


}