package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CUserPrintData implements Serializable {
    @Expose
    private Integer ChampName;
    @Expose
    private String imgSrc;
    @Expose
    private Long kill;
    @Expose
    private Long deaths;
    @Expose
    private Long assist;
    @Expose
    private Long average;
    @Expose
    private Long item0;
    @Expose
    private Long item1;
    @Expose
    private Long item2;
    @Expose
    private Long item3;
    @Expose
    private Long item4;
    @Expose
    private Long item5;
    @Expose
    private Long item6;
    @Expose
    private Long gameDuration;

    public Long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public int getChampName() {
        return ChampName;
    }

    public void setChampName(int champName) {
        ChampName = champName;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Long getKill() {
        return kill;
    }

    public void setKill(Long kill) {
        this.kill = kill;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public Long getAssist() {
        return assist;
    }

    public void setAssist(long assist) {
        this.assist = assist;
    }

    public Long getAverage() {
        return average;
    }

    public void setAverage(long average) {
        this.average = average;
    }

    public Long getItem0() {
        return item0;
    }

    public void setItem0(Long item0) {
        this.item0 = item0;
    }

    public Long getItem1() {
        return item1;
    }

    public void setItem1(Long item1) {
        this.item1 = item1;
    }

    public Long getItem2() {
        return item2;
    }

    public void setItem2(Long item2) {
        this.item2 = item2;
    }

    public Long getItem3() {
        return item3;
    }

    public void setItem3(Long item3) {
        this.item3 = item3;
    }

    public Long getItem4() {
        return item4;
    }

    public void setItem4(Long item4) {
        this.item4 = item4;
    }

    public Long getItem5() {
        return item5;
    }

    public void setItem5(Long item5) {
        this.item5 = item5;
    }

    public Long getItem6() {
        return item6;
    }

    public void setItem6(Long item6) {
        this.item6 = item6;
    }

    public Long getChamplevel() {
        return Champlevel;
    }

    public void setChamplevel(Long champlevel) {
        Champlevel = champlevel;
    }

    private Long Champlevel;



}
