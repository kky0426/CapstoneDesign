package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Ban implements Serializable{
    @SerializedName("championId")
    @Expose
    private long championId;
    @SerializedName("pickTurn")
    @Expose
    private long pickTurn;
    private final static long serialVersionUID = 253949725056769601L;

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public Ban withChampionId(long championId) {
        this.championId = championId;
        return this;
    }

    public long getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(long pickTurn) {
        this.pickTurn = pickTurn;
    }

    public Ban withPickTurn(long pickTurn) {
        this.pickTurn = pickTurn;
        return this;
    }
}
