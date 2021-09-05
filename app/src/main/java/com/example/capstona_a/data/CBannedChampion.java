package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CBannedChampion implements Serializable {
    @SerializedName("championId")
    @Expose
    private int championId;
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("pickTurn")
    @Expose
    private long pickTurn;
    private final static long serialVersionUID = 4538279777886468252L;

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public CBannedChampion withChampionId(int championId) {
        this.championId = championId;
        return this;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public CBannedChampion withTeamId(long teamId) {
        this.teamId = teamId;
        return this;
    }

    public long getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(long pickTurn) {
        this.pickTurn = pickTurn;
    }

    public CBannedChampion withPickTurn(long pickTurn) {
        this.pickTurn = pickTurn;
        return this;
    }
}
