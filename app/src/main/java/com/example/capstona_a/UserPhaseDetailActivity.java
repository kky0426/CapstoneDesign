package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstona_a.data.CMatchDetailDTO;
import com.example.capstona_a.data.CParticipant;

import java.util.ArrayList;

class UserPhaseDetailActivity extends AppCompatActivity {

    public static Long win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase_detail);

        Intent intent = getIntent();
        CMatchDetailDTO dto = (CMatchDetailDTO) intent.getSerializableExtra("GameData");
        dto.activateUsername();
        ArrayList<CParticipant> Redparticipants = new ArrayList<>();
        ArrayList<CParticipant> Blueparticipants = new ArrayList<>();
        ListView Red = (ListView) findViewById(R.id.listview_red_team);
        ListView Blue = (ListView) findViewById(R.id.listview_blue_team);
        int k = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (dto.getParticipants().get(i).getTeamId() == 100) {
                Redparticipants.add(j, dto.getParticipants().get(i));
                j++;
            } else {
                Blueparticipants.add(k, dto.getParticipants().get(i));
                k++;
            }

        }
        final UserPhaseDetailAdapter ReddetailAdapter = new UserPhaseDetailAdapter(getApplicationContext(), Redparticipants);
        final UserPhaseDetailAdapter BluedetailAdapter = new UserPhaseDetailAdapter(getApplicationContext(), Blueparticipants);
        Red.setAdapter(ReddetailAdapter);
        Blue.setAdapter(BluedetailAdapter);


    }


}