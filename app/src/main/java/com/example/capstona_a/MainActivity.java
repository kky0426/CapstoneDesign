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

import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.retrofit.RetroBuild;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button board_btn;
    private EditText editText;

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

        board_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BoardActivity.class);
                startActivity(intent);
            }
        });
    }

    private void viewBinding() {
        btn = (Button) findViewById(R.id.btn_search);
        editText = (EditText) findViewById(R.id.search_textbar);
        board_btn = (Button) findViewById(R.id.board_btn);
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
                    startActivity(intent);
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
