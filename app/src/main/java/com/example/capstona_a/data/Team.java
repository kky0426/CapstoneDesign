package com.example.capstona_a.data;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team implements Serializable
{

    @SerializedName("bans")
    @Expose
    private List<Ban> bans = null;
    @SerializedName("objectives")
    @Expose
    private Objectives objectives;
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("win")
    @Expose
    private boolean win;
    private final static long serialVersionUID = -4903917590916819740L;

    public List<Ban> getBans() {
        return bans;
    }

    public void setBans(List<Ban> bans) {
        this.bans = bans;
    }

    public Team withBans(List<Ban> bans) {
        this.bans = bans;
        return this;
    }

    public Objectives getObjectives() {
        return objectives;
    }

    public void setObjectives(Objectives objectives) {
        this.objectives = objectives;
    }

    public Team withObjectives(Objectives objectives) {
        this.objectives = objectives;
        return this;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public Team withTeamId(long teamId) {
        this.teamId = teamId;
        return this;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Team withWin(boolean win) {
        this.win = win;
        return this;
    }

}