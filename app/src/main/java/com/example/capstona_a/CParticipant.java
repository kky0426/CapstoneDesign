package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CParticipant implements Serializable {
    @SerializedName("participantId")
    @Expose
    private Long participantId;
    @SerializedName("teamId")
    @Expose
    private Long teamId;
    @SerializedName("championId")
    @Expose
    private Long championId;
    @SerializedName("spell1Id")
    @Expose
    private Long spell1Id;
    @SerializedName("spell2Id")
    @Expose
    private Long spell2Id;
    @SerializedName("stats")
    @Expose
    private CStats stats;
    @SerializedName("timeline")
    @Expose
    private CTimeline timeline;
    private final static long serialVersionUID = -7509224404413034069L;

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public CParticipant withParticipantId(Long participantId) {
        this.participantId = participantId;
        return this;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public CParticipant withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public CParticipant withChampionId(Long championId) {
        this.championId = championId;
        return this;
    }

    public Long getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(Long spell1Id) {
        this.spell1Id = spell1Id;
    }

    public CParticipant withSpell1Id(Long spell1Id) {
        this.spell1Id = spell1Id;
        return this;
    }

    public Long getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(Long spell2Id) {
        this.spell2Id = spell2Id;
    }

    public CParticipant withSpell2Id(Long spell2Id) {
        this.spell2Id = spell2Id;
        return this;
    }

    public CStats getStats() {
        return stats;
    }

    public void setStats(CStats stats) {
        this.stats = stats;
    }

    public CParticipant withStats(CStats stats) {
        this.stats = stats;
        return this;
    }

    public CTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(CTimeline timeline) {
        this.timeline = timeline;
    }

    public CParticipant withTimeline(CTimeline timeline) {
        this.timeline = timeline;
        return this;
    }
}
