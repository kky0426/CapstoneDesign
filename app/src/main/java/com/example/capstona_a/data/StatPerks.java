package com.example.capstona_a.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatPerks implements Serializable
{

    @SerializedName("defense")
    @Expose
    private long defense;
    @SerializedName("flex")
    @Expose
    private long flex;
    @SerializedName("offense")
    @Expose
    private long offense;
    private final static long serialVersionUID = 8220700685064896897L;

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public StatPerks withDefense(long defense) {
        this.defense = defense;
        return this;
    }

    public long getFlex() {
        return flex;
    }

    public void setFlex(long flex) {
        this.flex = flex;
    }

    public StatPerks withFlex(long flex) {
        this.flex = flex;
        return this;
    }

    public long getOffense() {
        return offense;
    }

    public void setOffense(long offense) {
        this.offense = offense;
    }

    public StatPerks withOffense(long offense) {
        this.offense = offense;
        return this;
    }

}