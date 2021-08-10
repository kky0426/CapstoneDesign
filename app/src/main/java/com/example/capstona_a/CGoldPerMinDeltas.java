package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CGoldPerMinDeltas implements Serializable {
    @SerializedName("10-20")
    @Expose
    private Double _1020;
    @SerializedName("0-10")
    @Expose
    private Double _010;
    private final static long serialVersionUID = -8958892367593010335L;

    public Double get1020() {
        return _1020;
    }

    public void set1020(Double _1020) {
        this._1020 = _1020;
    }

    public CGoldPerMinDeltas with1020(Double _1020) {
        this._1020 = _1020;
        return this;
    }

    public Double get010() {
        return _010;
    }

    public void set010(Double _010) {
        this._010 = _010;
    }

    public CGoldPerMinDeltas with010(Double _010) {
        this._010 = _010;
        return this;
    }
}
