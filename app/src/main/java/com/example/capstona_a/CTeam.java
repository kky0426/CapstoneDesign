package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CTeam implements Serializable {
    @SerializedName("teamId")
    @Expose
    private Long teamId;
    @SerializedName("win")
    @Expose
    private String win;
    @SerializedName("firstBlood")
    @Expose
    private Boolean firstBlood;
    @SerializedName("firstTower")
    @Expose
    private Boolean firstTower;
    @SerializedName("firstInhibitor")
    @Expose
    private Boolean firstInhibitor;
    @SerializedName("firstBaron")
    @Expose
    private Boolean firstBaron;
    @SerializedName("firstDragon")
    @Expose
    private Boolean firstDragon;
    @SerializedName("firstRiftHerald")
    @Expose
    private Boolean firstRiftHerald;
    @SerializedName("towerKills")
    @Expose
    private Long towerKills;
    @SerializedName("inhibitorKills")
    @Expose
    private Long inhibitorKills;
    @SerializedName("baronKills")
    @Expose
    private Long baronKills;
    @SerializedName("dragonKills")
    @Expose
    private Long dragonKills;
    @SerializedName("vilemawKills")
    @Expose
    private Long vilemawKills;
    @SerializedName("riftHeraldKills")
    @Expose
    private Long riftHeraldKills;
    @SerializedName("dominionVictoryScore")
    @Expose
    private Long dominionVictoryScore;
    @SerializedName("bans")
    @Expose
    private List<Object> bans = null;
    private final static long serialVersionUID = 8531438218361700242L;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public CTeam withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public CTeam withWin(String win) {
        this.win = win;
        return this;
    }

    public Boolean getFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(Boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public CTeam withFirstBlood(Boolean firstBlood) {
        this.firstBlood = firstBlood;
        return this;
    }

    public Boolean getFirstTower() {
        return firstTower;
    }

    public void setFirstTower(Boolean firstTower) {
        this.firstTower = firstTower;
    }

    public CTeam withFirstTower(Boolean firstTower) {
        this.firstTower = firstTower;
        return this;
    }

    public Boolean getFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(Boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public CTeam withFirstInhibitor(Boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
        return this;
    }

    public Boolean getFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(Boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public CTeam withFirstBaron(Boolean firstBaron) {
        this.firstBaron = firstBaron;
        return this;
    }

    public Boolean getFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(Boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public CTeam withFirstDragon(Boolean firstDragon) {
        this.firstDragon = firstDragon;
        return this;
    }

    public Boolean getFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(Boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public CTeam withFirstRiftHerald(Boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
        return this;
    }

    public Long getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(Long towerKills) {
        this.towerKills = towerKills;
    }

    public CTeam withTowerKills(Long towerKills) {
        this.towerKills = towerKills;
        return this;
    }

    public Long getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public CTeam withInhibitorKills(Long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
        return this;
    }

    public Long getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(Long baronKills) {
        this.baronKills = baronKills;
    }

    public CTeam withBaronKills(Long baronKills) {
        this.baronKills = baronKills;
        return this;
    }

    public Long getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(Long dragonKills) {
        this.dragonKills = dragonKills;
    }

    public CTeam withDragonKills(Long dragonKills) {
        this.dragonKills = dragonKills;
        return this;
    }

    public Long getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(Long vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public CTeam withVilemawKills(Long vilemawKills) {
        this.vilemawKills = vilemawKills;
        return this;
    }

    public Long getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(Long riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public CTeam withRiftHeraldKills(Long riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
        return this;
    }

    public Long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(Long dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public CTeam withDominionVictoryScore(Long dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
        return this;
    }

    public List<Object> getBans() {
        return bans;
    }

    public void setBans(List<Object> bans) {
        this.bans = bans;
    }

    public CTeam withBans(List<Object> bans) {
        this.bans = bans;
        return this;
    }


}
