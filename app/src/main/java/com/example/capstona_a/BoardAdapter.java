package com.example.capstona_a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capstona_a.data.Board;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.retrofit.RetroBuild;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BoardAdapter extends RecyclerView.Adapter<BoardViewHolder> {
    private final ArrayList<Board> itemList;

    public BoardAdapter() {
        itemList = new ArrayList<>();
    }
    CUserDTO SearchingUser=new CUserDTO();
    String username=null;
    @NonNull
    @Override
    public BoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.board_detail, parent, false);
        BoardViewHolder viewHolder = new BoardViewHolder(view);




        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull BoardViewHolder holder, int position) {
        Board board = itemList.get(position);
        Log.d("board", board.getContent());
        holder.name.setText(board.getName());
        holder.content.setText(board.getContent());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),UserPhaseActivity.class);
                Call<CUserDTO> res_a= RetroBuild.getInstance().getService().getAcc_id(board.getName(),Util.API_KEY());
                res_a.enqueue(new Callback<CUserDTO>() {
                    @Override
                    public void onResponse(Call<CUserDTO> call, Response<CUserDTO> response) {
                        CUserDTO dto = response.body();
                        intent.putExtra("user",dto);
                        view.getContext().startActivity(intent);



                    }

                    @Override
                    public void onFailure(Call<CUserDTO> call, Throwable t) {
                        Log.d("error",t.toString());

                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void addItem(Board board) {
        itemList.add(board);
    }
}
