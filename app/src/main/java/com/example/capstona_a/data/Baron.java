package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Baron implements Serializable {
    @SerializedName("first")
    @Expose
    private boolean first;
    @SerializedName("kills")
    @Expose
    private long kills;
    private final static long serialVersionUID = -648111402296475602L;

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public Baron withFirst(boolean first) {
        this.first = first;
        return this;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public Baron withKills(long kills) {
        this.kills = kills;
        return this;
    }
}
