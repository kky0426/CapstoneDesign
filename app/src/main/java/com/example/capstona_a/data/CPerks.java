package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CPerks implements Serializable {
    @SerializedName("perkIds")
    @Expose
    private List<Long> perkIds = null;
    @SerializedName("perkStyle")
    @Expose
    private long perkStyle;
    @SerializedName("perkSubStyle")
    @Expose
    private long perkSubStyle;
    private final static long serialVersionUID = 1562291216995394172L;

    public List<Long> getPerkIds() {
        return perkIds;
    }

    public void setPerkIds(List<Long> perkIds) {
        this.perkIds = perkIds;
    }

    public CPerks withPerkIds(List<Long> perkIds) {
        this.perkIds = perkIds;
        return this;
    }

    public long getPerkStyle() {
        return perkStyle;
    }

    public void setPerkStyle(long perkStyle) {
        this.perkStyle = perkStyle;
    }

    public CPerks withPerkStyle(long perkStyle) {
        this.perkStyle = perkStyle;
        return this;
    }

    public long getPerkSubStyle() {
        return perkSubStyle;
    }

    public void setPerkSubStyle(long perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
    }

    public CPerks withPerkSubStyle(long perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
        return this;
    }
}
