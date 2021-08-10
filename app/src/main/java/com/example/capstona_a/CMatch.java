package com.example.capstona_a;

import android.app.Application;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CMatch {
    /*
    @SerializedName("platformId")
    @Expose
    private String platformId;
     */
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("champion")
    @Expose
    private Integer champion;
    /*
    @SerializedName("queue")
    @Expose
    private Integer queue;
    @SerializedName("season")
    @Expose
    private Integer season;

     */
/*
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

 */
    /*
    @SerializedName("role")
    @Expose
    private String role;
    */
    @SerializedName("lane")
    @Expose
    private String lane;
    private String imgSrc;
    private List<CTeam> teams = null;
    private boolean datapresence;
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<CTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<CTeam> teams) {
        this.teams = teams;
    }

    public boolean isDatapresence() {
        return datapresence;
    }

    public void setDatapresence(boolean datapresence) {
        this.datapresence = datapresence;
    }

    public Long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public List<CParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CParticipant> participants) {
        this.participants = participants;
    }

    public List<CParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<CParticipantIdentity> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    private Long gameDuration;
    private List<CParticipant> participants = null;
    private List<CParticipantIdentity> participantIdentities = null;
    public String getChampName() {
        return ChampName;
    }

    public void setChampName(String champName) {
        ChampName = champName;
    }

    private String ChampName;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    /*
        public String getPlatformId() {
            return platformId;
        }

        public void setPlatformId(String platformId) {
            this.platformId = platformId;
        }

        public CMatch withPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }
    */
    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public CMatch withGameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }

    public Integer getChampion() {
        return champion;
    }

    public void setChampion(Integer champion) {
        this.champion = champion;
    }

    public CMatch withChampion(Integer champion) {
        this.champion = champion;
        return this;
    }
/*
    public Integer getQueue() {
        return queue;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public CMatch withQueue(Integer queue) {
        this.queue = queue;
        return this;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public CMatch withSeason(Integer season) {
        this.season = season;
        return this;
    }
*/
    /*
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public CMatch withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    */

/*
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public CMatch withRole(String role) {
        this.role = role;
        return this;
    }
*/
    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public CMatch withLane(String lane) {
        this.lane = lane;
        return this;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CMatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gameId");
        sb.append('=');
        sb.append(((this.gameId == null)?"<null>":this.gameId));
        sb.append(',');
        sb.append("champion");
        sb.append('=');
        sb.append(((this.champion == null)?"<null>":this.champion));
        sb.append(',');
        sb.append("lane");
        sb.append('=');
        sb.append(((this.lane == null)?"<null>":this.lane));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


}