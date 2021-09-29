package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.capstona_a.data.CUserAPP;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.retrofit.RetroBuild;
import com.example.capstona_a.retrofit.RetroV5Build;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button board_btn;
    private EditText editText;
    private final int MATCH_LENGTH = 11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 뷰 바인딩
        viewBinding();

        String api_key = Util.API_KEY();

        // 뷰에 핸들러 달기
        btn.setOnClickListener(v -> {
            String name = editText.getText().toString();
            summoner(name.trim(), api_key, v);
        });

        board_btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BoardActivity.class);
            startActivity(intent);
        });
    }

    private void viewBinding() {
        btn = findViewById(R.id.btn_search);
        editText = findViewById(R.id.search_textbar);
        board_btn = findViewById(R.id.board_btn);
    }
    private void matchlist(String puuid,String api_key,Intent intent){
        Call<JsonArray> res4 = RetroV5Build.getInstance().getService().getMatchId(puuid, api_key);
        res4.enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                JsonArray array = response.body();
                if (array == null) {
                    Log.d("주석아 나가죽자~", "GOOD~");
                } else {
                    ArrayList<String> gameid = new ArrayList<>();
                    for (int i = 0; i < MATCH_LENGTH; i++) {
                        JsonElement match1 = array.get(i);

                        gameid.add(match1.toString());
                        Log.d("gameId",gameid.toString());

                    }
                    intent.putExtra("Matchlist",gameid);
                    startActivity(intent);
                }
            }


            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {
                Log.d("zzss", t.toString());
            }
        });

    }
    private void summoner(String name, String api_key, View v) {
        Call<CUserDTO> res = RetroBuild.getInstance().getService().getAcc_id(name, api_key);
        res.enqueue(new Callback<CUserDTO>() {
            @Override
            public void onResponse(@NonNull Call<CUserDTO> call, @NonNull Response<CUserDTO> response) {
                Log.d("MainActivity", response.toString());
                CUserDTO CUserDTO1 = response.body();

                if (CUserDTO1 == null) {
                    // TODO 만약 해당하는 이름의 서머너가 존재 하지 않았을 경우를 처리해야함
                    Log.d("MainActivity", "해당하는 서머너가 존재하지 않습니다  OnSuccess: " + name);
                    if (v != null) {
                        Toast.makeText(v.getContext(), "해당하는 서머너가 존재하지 않습니다", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Intent intent = new Intent(MainActivity.this, UserPhaseActivity.class);
                    intent.putExtra("user", CUserDTO1);
                    matchlist(CUserDTO1.getPuuid(),api_key,intent);
                }
            }

            @Override
            public void onFailure(@NonNull Call<CUserDTO> call, @NonNull Throwable t) {
                Log.d("MainActivity", "해당하는 서머너가 존재하지 않습니다 OnFailure: " + name);
                if (v != null) {
                    Toast.makeText(v.getContext(), "해당하는 서머너가 존재하지 않습니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
