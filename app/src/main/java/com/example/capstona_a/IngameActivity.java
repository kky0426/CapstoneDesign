package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.CUserDTO;

public class InGameActivity extends AppCompatActivity {

    private TextView textview3;

    private ImageView img;

    private ListView listViewBlue;
    private ListView listViewRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingame);

        // 뷰 바인딩
        viewBinding();

        //
        Intent intent3 = getIntent();
        CUserDTO user = (CUserDTO) intent3.getSerializableExtra("user");

        // 뷰 세팅
        textview3.setText(user.getName());
        String imgSrc = Util.getProfileImgSrc(user.getProfileIconId());
        Glide.with(this).load(imgSrc).into(img);


        String api_key = Util.API_KEY();
    }

    private void viewBinding() {
        textview3 = (TextView) findViewById(R.id.name_summoner_ingame);

        img = (ImageView) findViewById(R.id.img_ingame);

        listViewBlue = (ListView) findViewById(R.id.listview_ingame_blue);
        listViewRed = (ListView) findViewById(R.id.listview_ingame_red);
    }
}