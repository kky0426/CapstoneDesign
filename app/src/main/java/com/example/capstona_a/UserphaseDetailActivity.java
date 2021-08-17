package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstona_a.data.CMatchDetailDTO;

public class UserPhaseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phase_detail);

        //
        Intent intent = getIntent();
        CMatchDetailDTO dto = (CMatchDetailDTO) intent.getSerializableExtra("GameData");

    }

}