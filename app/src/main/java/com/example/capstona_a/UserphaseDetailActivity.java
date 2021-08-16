package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserphaseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userphase_detail);
        Intent intent = getIntent();
        CMatchDetailDTO dto=(CMatchDetailDTO)intent.getSerializableExtra("GameData");


    }
}