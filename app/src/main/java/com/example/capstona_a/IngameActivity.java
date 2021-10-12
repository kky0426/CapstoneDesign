package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.capstona_a.data.CSpectatorDTO;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.data.Ingame;
import com.example.capstona_a.data.Player;
import com.example.capstona_a.retrofit.GetServerService;
import com.example.capstona_a.retrofit.RetroBuild;
import com.example.capstona_a.retrofit.RetroServerBuild;
import com.google.android.material.progressindicator.CircularProgressIndicator;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IngameActivity extends AppCompatActivity {

    private TextView textview3;

    private ImageView img;

    private ListView listViewBlue;
    private ListView listViewRed;
    private Button btn_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingame);

        // 뷰 바인딩
        viewBinding();

        //
        btn_record.setEnabled(false);
        //
        Intent intent3 = getIntent();
        CUserDTO user = (CUserDTO) intent3.getSerializableExtra("user");

        //TODO 인게임 승률 출력용
        Intent intent4 = new Intent(this,IngameRateActivity.class);

        // 뷰 세팅
        textview3.setText(user.getName());
        String imgSrc = Util.getProfileImgSrc(user.getProfileIconId());
        Glide.with(this).load(imgSrc).into(img);


        String api_key = Util.API_KEY();


        GetServerService service = RetroServerBuild.getInstance().getService();
        Call<Ingame> result = service.getIngameData(textview3.getText().toString());
        Log.d("start", String.valueOf(System.currentTimeMillis()));
        result.enqueue(new Callback<Ingame>() {
            @Override
            public void onResponse(@NonNull Call<Ingame> call, @NonNull Response<Ingame> response) {
                assert response.body() != null;

                Log.d("server : ", response.body().toString());
                Ingame data= response.body();
                String rate=data.toString();
                intent4.putExtra("data",rate);
                btn_record.setEnabled(true);
                try{
                    List<Player> players=data.getPlayer();
                    List<Player> blue = players.subList(0,5);
                    List<Player> red=players.subList(5,10);
                    Log.d("asd",red.toString());
                    final IngameAdapter blueAdapter = new IngameAdapter(getApplicationContext(),blue);
                    listViewBlue.setAdapter(blueAdapter);
                    final IngameAdapter redAdapter = new IngameAdapter(getApplicationContext(),red);
                    listViewRed.setAdapter(redAdapter);

                }catch(NullPointerException e){
                    Log.d("error","겜중이아님.");
                    Intent intent5 = new Intent(getApplicationContext(),NotIngameActivity.class);
                    startActivityForResult(intent5,1);

                }



            }

            @Override
            public void onFailure(@NonNull Call<Ingame> call, @NonNull Throwable t) {
                Log.d("server : ", t.toString());

                Call<CSpectatorDTO> res4 = RetroBuild.getInstance().getService().getSpecdata(user.getId(), api_key);
                res4.enqueue(new Callback<CSpectatorDTO>() {
                    @Override
                    public void onResponse(@NonNull Call<CSpectatorDTO> call, @NonNull Response<CSpectatorDTO> response) {
                        Log.d("retro spec success", response.toString());
                    }

                    @Override
                    public void onFailure(@NonNull Call<CSpectatorDTO> call, @NonNull Throwable t) {
                        Log.d("retro spec fail", t.toString());
                    }
                });
            }
        });
        btn_record.setOnClickListener(view -> {
            startActivityForResult(intent4,1);




        });
    }

    private void viewBinding() {
        btn_record=findViewById(R.id.btn_ingame_record);
        textview3 = findViewById(R.id.name_summoner_ingame);
        img = findViewById(R.id.img_ingame);
        listViewBlue = findViewById(R.id.listview_ingame_blue);
        listViewRed = findViewById(R.id.listview_ingame_red);

    }
}