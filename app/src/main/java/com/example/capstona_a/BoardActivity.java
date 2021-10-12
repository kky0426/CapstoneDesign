package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capstona_a.data.Board;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.data.CuserLeagueEntryDTO;
import com.example.capstona_a.retrofit.GetServerService;
import com.example.capstona_a.retrofit.RetroBuild;
import com.example.capstona_a.retrofit.RetroServerBuild;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BoardActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BoardAdapter boardAdapter;

    EditText content;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        boardAdapter = new BoardAdapter();
        String api_key=Util.API_KEY();
        GetServerService service = RetroServerBuild.getInstance().getService();
        Call<List<Board>> result = service.getBoard();
        result.enqueue(new Callback<List<Board>>() {
            @Override
            public void onResponse(@NonNull Call<List<Board>> call, @NonNull Response<List<Board>> response) {
                List<Board> boards = response.body();
                if (boards == null) {
                    return;
                }
                for (int i = 0; i < boards.size(); i++) {
                    boardAdapter.addItem(boards.get(i));
                }
                recyclerView.setAdapter(boardAdapter);
            }

            @Override
            public void onFailure(@NonNull Call<List<Board>> call, @NonNull Throwable t) {

            }
        });

        Button writingBtn = findViewById(R.id.write_btn);
        Button certifyBt = findViewById(R.id.certify_btn);
        writingBtn.setEnabled(false);
        certifyBt.setOnClickListener(v -> {
            name=findViewById(R.id.write_name);
            String name_= name.getText().toString();
            Call<CUserDTO> resboard= RetroBuild.getInstance().getService().getAcc_id(name_,api_key);
            resboard.enqueue(new Callback<CUserDTO>() {
                @Override
                public void onResponse(Call<CUserDTO> call, Response<CUserDTO> response) {
                    if(response.body()==null){
                        Toast.makeText(getApplicationContext(),"해당 이름의 소환사가 없습니다",Toast.LENGTH_SHORT).show();


                    }
                    else{
                        Toast.makeText(getApplicationContext(),"인증에 성공하였습니다",Toast.LENGTH_SHORT).show();
                        writingBtn.setEnabled(true); // 인증성공

                    }


                }

                @Override
                public void onFailure(Call<CUserDTO> call, Throwable t) {
                    Log.d("그런 유저 없음","인증 다시하세요");
                    Toast.makeText(getApplicationContext(), "해당 이름의 유저가 없습니다.", Toast.LENGTH_SHORT).show();

                }
            });
        });
        writingBtn.setOnClickListener(v -> {
            content = findViewById(R.id.write_content);
            name = findViewById(R.id.write_name);
            String name_ = name.getText().toString();
            String content_ = content.getText().toString();
            if (name_ == null || name_.equals("") || content_ == null || content_.equals("")) {
                Toast.makeText(BoardActivity.this, "소환사명 또는 내용을 입력해주세요.", Toast.LENGTH_SHORT).show();
            } else {
                Map<String, String> data = new HashMap<>();
                data.put("name", name_);
                data.put("content", content_);
                Call<String> res = service.postBoard(data);
                res.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {
                        finish();
                        overridePendingTransition(0, 0);
                        Intent intent = getIntent();
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                    }

                    @Override
                    public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {

                    }
                });
            }

        });

    }

}