package com.example.capstona_a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capstona_a.data.Board;
import com.example.capstona_a.retrofit.GetServerService;
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