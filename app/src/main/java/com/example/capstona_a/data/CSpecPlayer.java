package com.example.capstona_a.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CSpecPlayer {

    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("fstSpellId")
    @Expose
    private Long fstSpellId;
    @SerializedName("scnSpellId")
    @Expose
    private Long scnSpellId;
    @SerializedName("championId")
    @Expose
    private Long championId;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("avgStats")
    @Expose
    private CAvgStats avgStats;

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Long getFstSpellId() {
        return fstSpellId;
    }

    public void setFstSpellId(Long fstSpellId) {
        this.fstSpellId = fstSpellId;
    }

    public Long getScnSpellId() {
        return scnSpellId;
    }

    public void setScnSpellId(Long scnSpellId) {
        this.scnSpellId = scnSpellId;
    }

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CAvgStats getAvgStats() {
        return avgStats;
    }

    public void setAvgStats(CAvgStats avgStats) {
        this.avgStats = avgStats;
    }

}
