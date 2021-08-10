package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CMatchDetailDTO implements Serializable {
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    /*
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("gameCreation")
    @Expose
    private Long gameCreation;

     */
    @SerializedName("gameDuration")
    @Expose
    private Long gameDuration;
    /*
    @SerializedName("queueId")
    @Expose
    private Long queueId;
    @SerializedName("mapId")
    @Expose
    private Long mapId;
    @SerializedName("seasonId")
    @Expose
    private Long seasonId;
    @SerializedName("gameVersion")
    @Expose
    private String gameVersion;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    */
    @SerializedName("teams")
    @Expose
    private List<CTeam> teams = null;
    @SerializedName("participants")
    @Expose
    private List<CParticipant> participants = null;

    public List<CParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<CParticipantIdentity> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    @SerializedName("participantIdentities")
    @Expose
    private List<CParticipantIdentity> participantIdentities = null;
    private final static long serialVersionUID = 3312362625352752473L;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public CMatchDetailDTO withGameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }
/*
    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public CMatchDetailDTO withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    public Long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(Long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public CMatchDetailDTO withGameCreation(Long gameCreation) {
        this.gameCreation = gameCreation;
        return this;
    }
*/
    public Long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public CMatchDetailDTO withGameDuration(Long gameDuration) {
        this.gameDuration = gameDuration;
        return this;
    }
/*
    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public CMatchDetailDTO withQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public CMatchDetailDTO withMapId(Long mapId) {
        this.mapId = mapId;
        return this;
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public CMatchDetailDTO withSeasonId(Long seasonId) {
        this.seasonId = seasonId;
        return this;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public CMatchDetailDTO withGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public CMatchDetailDTO withGameMode(String gameMode) {
        this.gameMode = gameMode;
        return this;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public CMatchDetailDTO withGameType(String gameType) {
        this.gameType = gameType;
        return this;
    }
*/
    public List<CTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<CTeam> teams) {
        this.teams = teams;
    }

    public CMatchDetailDTO withTeams(List<CTeam> teams) {
        this.teams = teams;
        return this;
    }

    public List<CParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CParticipant> participants) {
        this.participants = participants;
    }

    public CMatchDetailDTO withParticipants(List<CParticipant> participants) {
        this.participants = participants;
        return this;
    }

}
