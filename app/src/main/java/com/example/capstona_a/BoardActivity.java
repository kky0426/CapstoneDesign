package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.capstona_a.R;
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

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        boardAdapter = new BoardAdapter();

        GetServerService service = RetroServerBuild.getInstance().getService();
        Call<List<Board>> result = service.getBoard();
        result.enqueue(new Callback<List<Board>>() {
            @Override
            public void onResponse(Call<List<Board>> call, Response<List<Board>> response) {
                List<Board> boards = response.body();
                if (boards == null){
                    return;
                }
                for(int i =0;i<boards.size();i++){
                    boardAdapter.addItem(boards.get(i));
                }
                recyclerView.setAdapter(boardAdapter);
            }

            @Override
            public void onFailure(Call<List<Board>> call, Throwable t) {

            }
        });

        Button writingBtn = (Button) findViewById(R.id.write_btn);
        writingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content = (EditText)findViewById(R.id.write_content);
                name = (EditText) findViewById(R.id.write_name);
                String name_ = name.getText().toString();
                String content_ = content.getText().toString();
                if(name_ == null || name_.equals("") || content_ == null || content_.equals("")){
                    Toast.makeText(BoardActivity.this,"소환사명 또는 내용을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    Map<String,String> data = new HashMap<>();
                    data.put("name",name_);
                    data.put("content",content_);
                    Call<String> res = service.postBoard(data);
                    res.enqueue(new Callback<String>() {
                        @Override
                        public void onResponse(Call<String> call, Response<String> response) {
                            finish();
                            overridePendingTransition(0,0);
                            Intent intent = getIntent();
                            startActivity(intent);
                            overridePendingTransition(0,0);
                        }

                        @Override
                        public void onFailure(Call<String> call, Throwable t) {

                        }
                    });
                }

            }
        });

    }
}