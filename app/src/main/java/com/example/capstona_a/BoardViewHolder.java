package com.example.capstona_a;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capstona_a.data.Board;
import com.example.capstona_a.data.CUserDTO;

public class BoardViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView content;
    public Button btn;
    public BoardViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.board_name);
        content = itemView.findViewById(R.id.board_content);
        btn=itemView.findViewById(R.id.btn_board_search);


    }
}
