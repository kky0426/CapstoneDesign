package com.example.capstona_a.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Dragon implements Serializable
{

    @SerializedName("first")
    @Expose
    private boolean first;
    @SerializedName("kills")
    @Expose
    private long kills;
    private final static long serialVersionUID = 2238691659976740255L;

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public Dragon withFirst(boolean first) {
        this.first = first;
        return this;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public Dragon withKills(long kills) {
        this.kills = kills;
        return this;
    }

}