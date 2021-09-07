package com.example.capstona_a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BoardViewHolder extends RecyclerView.ViewHolder{
    public TextView name;
    public TextView content;

    public BoardViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.board_name);
        content = itemView.findViewById(R.id.board_content);

    }
}
