package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CPlayer implements Serializable {
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;
    @SerializedName("currentPlatformId")
    @Expose
    private String currentPlatformId;
    @SerializedName("currentAccountId")
    @Expose
    private String currentAccountId;
    @SerializedName("matchHistoryUri")
    @Expose
    private String matchHistoryUri;
    @SerializedName("profileIcon")
    @Expose
    private Long profileIcon;
    private final static long serialVersionUID = -2946821441424060710L;

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public CPlayer withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CPlayer withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public CPlayer withSummonerName(String summonerName) {
        this.summonerName = summonerName;
        return this;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public CPlayer withSummonerId(String summonerId) {
        this.summonerId = summonerId;
        return this;
    }

    public String getCurrentPlatformId() {
        return currentPlatformId;
    }

    public void setCurrentPlatformId(String currentPlatformId) {
        this.currentPlatformId = currentPlatformId;
    }

    public CPlayer withCurrentPlatformId(String currentPlatformId) {
        this.currentPlatformId = currentPlatformId;
        return this;
    }

    public String getCurrentAccountId() {
        return currentAccountId;
    }

    public void setCurrentAccountId(String currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    public CPlayer withCurrentAccountId(String currentAccountId) {
        this.currentAccountId = currentAccountId;
        return this;
    }

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public CPlayer withMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
        return this;
    }

    public Long getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(Long profileIcon) {
        this.profileIcon = profileIcon;
    }

    public CPlayer withProfileIcon(Long profileIcon) {
        this.profileIcon = profileIcon;
        return this;
    }
}
