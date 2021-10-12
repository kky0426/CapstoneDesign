package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CParticipant2 implements Serializable {
    @SerializedName("teamId")
    @Expose
    private long teamId;
    @SerializedName("spell1Id")
    @Expose
    private long spell1Id;
    @SerializedName("spell2Id")
    @Expose
    private long spell2Id;
    @SerializedName("championId")
    @Expose
    private long championId;
    @SerializedName("profileIconId")
    @Expose
    private long profileIconId;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("bot")
    @Expose
    private boolean bot;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("gameCustomizationObjects")
    @Expose
    private List<Object> gameCustomizationObjects = null;
    @SerializedName("perks")
    @Expose
    private CPerks perks;
    private final static long serialVersionUID = -4611804271102818495L;

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public CParticipant2 withTeamId(long teamId) {
        this.teamId = teamId;
        return this;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public CParticipant2 withSpell1Id(long spell1Id) {
        this.spell1Id = spell1Id;
        return this;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public CParticipant2 withSpell2Id(long spell2Id) {
        this.spell2Id = spell2Id;
        return this;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public CParticipant2 withChampionId(long championId) {
        this.championId = championId;
        return this;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public CParticipant2 withProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
        return this;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public CParticipant2 withSummonerName(String summonerName) {
        this.summonerName = summonerName;
        return this;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public CParticipant2 withBot(boolean bot) {
        this.bot = bot;
        return this;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public CParticipant2 withSummonerId(String summonerId) {
        this.summonerId = summonerId;
        return this;
    }

    public List<Object> getGameCustomizationObjects() {
        return gameCustomizationObjects;
    }

    public void setGameCustomizationObjects(List<Object> gameCustomizationObjects) {
        this.gameCustomizationObjects = gameCustomizationObjects;
    }

    public CParticipant2 withGameCustomizationObjects(List<Object> gameCustomizationObjects) {
        this.gameCustomizationObjects = gameCustomizationObjects;
        return this;
    }

    public CPerks getPerks() {
        return perks;
    }

    public void setPerks(CPerks perks) {
        this.perks = perks;
    }

    public CParticipant2 withPerks(CPerks perks) {
        this.perks = perks;
        return this;
    }

}

