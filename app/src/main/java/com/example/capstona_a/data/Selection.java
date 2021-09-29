package com.example.capstona_a.data;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Selection implements Serializable
{

    @SerializedName("perk")
    @Expose
    private long perk;
    @SerializedName("var1")
    @Expose
    private long var1;
    @SerializedName("var2")
    @Expose
    private long var2;
    @SerializedName("var3")
    @Expose
    private long var3;
    private final static long serialVersionUID = 6312487605681660418L;

    public long getPerk() {
        return perk;
    }

    public void setPerk(long perk) {
        this.perk = perk;
    }

    public Selection withPerk(long perk) {
        this.perk = perk;
        return this;
    }

    public long getVar1() {
        return var1;
    }

    public void setVar1(long var1) {
        this.var1 = var1;
    }

    public Selection withVar1(long var1) {
        this.var1 = var1;
        return this;
    }

    public long getVar2() {
        return var2;
    }

    public void setVar2(long var2) {
        this.var2 = var2;
    }

    public Selection withVar2(long var2) {
        this.var2 = var2;
        return this;
    }

    public long getVar3() {
        return var3;
    }

    public void setVar3(long var3) {
        this.var3 = var3;
    }

    public Selection withVar3(long var3) {
        this.var3 = var3;
        return this;
    }

}