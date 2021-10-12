package com.example.capstona_a.data;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info implements Serializable
{

    @SerializedName("gameCreation")
    @Expose
    private long gameCreation;
    @SerializedName("gameDuration")
    @Expose
    private long gameDuration;
    @SerializedName("gameId")
    @Expose
    private long gameId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameName")
    @Expose
    private String gameName;
    @SerializedName("gameStartTimestamp")
    @Expose
    private long gameStartTimestamp;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameVersion")
    @Expose
    private String gameVersion;
    @SerializedName("mapId")
    @Expose
    private long mapId;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("queueId")
    @Expose
    private long queueId;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("tournamentCode")
    @Expose
    private String tournamentCode;
    private final static long serialVersionUID = -3276011594444984443L;

    public long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public Info withGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
        return this;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public Info withGameDuration(long gameDuration) {
        this.gameDuration = gameDuration;
        return this;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public Info withGameId(long gameId) {
        this.gameId = gameId;
        return this;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public Info withGameMode(String gameMode) {
        this.gameMode = gameMode;
        return this;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Info withGameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    public long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    public void setGameStartTimestamp(long gameStartTimestamp) {
        this.gameStartTimestamp = gameStartTimestamp;
    }

    public Info withGameStartTimestamp(long gameStartTimestamp) {
        this.gameStartTimestamp = gameStartTimestamp;
        return this;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Info withGameType(String gameType) {
        this.gameType = gameType;
        return this;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public Info withGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public Info withMapId(long mapId) {
        this.mapId = mapId;
        return this;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Info withParticipants(List<Participant> participants) {
        this.participants = participants;
        return this;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Info withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    public long getQueueId() {
        return queueId;
    }

    public void setQueueId(long queueId) {
        this.queueId = queueId;
    }

    public Info withQueueId(long queueId) {
        this.queueId = queueId;
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Info withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public String getTournamentCode() {
        return tournamentCode;
    }

    public void setTournamentCode(String tournamentCode) {
        this.tournamentCode = tournamentCode;
    }

    public Info withTournamentCode(String tournamentCode) {
        this.tournamentCode = tournamentCode;
        return this;
    }

}