package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CSpectatorDTO implements Serializable {
    @SerializedName("gameId")
    @Expose
    private long gameId;
    @SerializedName("mapId")
    @Expose
    private long mapId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameQueueConfigId")
    @Expose
    private long gameQueueConfigId;
    @SerializedName("participants")
    @Expose
    private List<CParticipant2> participants = null;
    @SerializedName("observers")
    @Expose
    private CObservers observers;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("bannedChampions")
    @Expose
    private List<CBannedChampion> bannedChampions = null;
    @SerializedName("gameStartTime")
    @Expose
    private long gameStartTime;
    @SerializedName("gameLength")
    @Expose
    private long gameLength;
    private final static long serialVersionUID = -51909267876354799L;

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public CSpectatorDTO withGameId(long gameId) {
        this.gameId = gameId;
        return this;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public CSpectatorDTO withMapId(long mapId) {
        this.mapId = mapId;
        return this;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public CSpectatorDTO withGameMode(String gameMode) {
        this.gameMode = gameMode;
        return this;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public CSpectatorDTO withGameType(String gameType) {
        this.gameType = gameType;
        return this;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public CSpectatorDTO withGameQueueConfigId(long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
        return this;
    }

    public List<CParticipant2> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CParticipant2> participants) {
        this.participants = participants;
    }

    public CSpectatorDTO withParticipants(List<CParticipant2> participants) {
        this.participants = participants;
        return this;
    }

    public CObservers getObservers() {
        return observers;
    }

    public void setObservers(CObservers observers) {
        this.observers = observers;
    }

    public CSpectatorDTO withObservers(CObservers observers) {
        this.observers = observers;
        return this;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public CSpectatorDTO withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    public List<CBannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<CBannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public CSpectatorDTO withBannedChampions(List<CBannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
        return this;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public CSpectatorDTO withGameStartTime(long gameStartTime) {
        this.gameStartTime = gameStartTime;
        return this;
    }

    public long getGameLength() {
        return gameLength;
    }

    public void setGameLength(long gameLength) {
        this.gameLength = gameLength;
    }

    public CSpectatorDTO withGameLength(long gameLength) {
        this.gameLength = gameLength;
        return this;
    }

}
