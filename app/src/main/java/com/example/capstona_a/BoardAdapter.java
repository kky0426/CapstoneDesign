package com.example.capstona_a;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capstona_a.data.Board;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter<BoardViewHolder> {
    private final ArrayList<Board> itemList;

    public BoardAdapter() {
        itemList = new ArrayList<>();
    }

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
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void addItem(Board board) {
        itemList.add(board);
    }
}
