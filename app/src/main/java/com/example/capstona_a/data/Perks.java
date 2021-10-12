package com.example.capstona_a.data;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Perks implements Serializable
{

    @SerializedName("statPerks")
    @Expose
    private StatPerks statPerks;
    @SerializedName("styles")
    @Expose
    private List<Style> styles = null;
    private final static long serialVersionUID = 8580240209034415101L;

    public StatPerks getStatPerks() {
        return statPerks;
    }

    public void setStatPerks(StatPerks statPerks) {
        this.statPerks = statPerks;
    }

    public Perks withStatPerks(StatPerks statPerks) {
        this.statPerks = statPerks;
        return this;
    }

    public List<Style> getStyles() {
        return styles;
    }

    public void setStyles(List<Style> styles) {
        this.styles = styles;
    }

    public Perks withStyles(List<Style> styles) {
        this.styles = styles;
        return this;
    }

}