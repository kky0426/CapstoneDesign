package com.example.capstona_a.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Objectives implements Serializable
{

    @SerializedName("baron")
    @Expose
    private Baron baron;
    @SerializedName("champion")
    @Expose
    private Champion champion;
    @SerializedName("dragon")
    @Expose
    private Dragon dragon;
    @SerializedName("inhibitor")
    @Expose
    private Inhibitor inhibitor;
    @SerializedName("riftHerald")
    @Expose
    private RiftHerald riftHerald;
    @SerializedName("tower")
    @Expose
    private Tower tower;
    private final static long serialVersionUID = 899024971067567044L;

    public Baron getBaron() {
        return baron;
    }

    public void setBaron(Baron baron) {
        this.baron = baron;
    }

    public Objectives withBaron(Baron baron) {
        this.baron = baron;
        return this;
    }

    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public Objectives withChampion(Champion champion) {
        this.champion = champion;
        return this;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public Objectives withDragon(Dragon dragon) {
        this.dragon = dragon;
        return this;
    }

    public Inhibitor getInhibitor() {
        return inhibitor;
    }

    public void setInhibitor(Inhibitor inhibitor) {
        this.inhibitor = inhibitor;
    }

    public Objectives withInhibitor(Inhibitor inhibitor) {
        this.inhibitor = inhibitor;
        return this;
    }

    public RiftHerald getRiftHerald() {
        return riftHerald;
    }

    public void setRiftHerald(RiftHerald riftHerald) {
        this.riftHerald = riftHerald;
    }

    public Objectives withRiftHerald(RiftHerald riftHerald) {
        this.riftHerald = riftHerald;
        return this;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public Objectives withTower(Tower tower) {
        this.tower = tower;
        return this;
    }

}