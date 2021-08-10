package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CTimeline implements Serializable {
    @SerializedName("participantId")
    @Expose
    private Long participantId;
    @SerializedName("creepsPerMinDeltas")
    @Expose
    private CCreepsPerMinDeltas creepsPerMinDeltas;
    @SerializedName("xpPerMinDeltas")
    @Expose
    private CXpPerMinDeltas xpPerMinDeltas;
    @SerializedName("goldPerMinDeltas")
    @Expose
    private CGoldPerMinDeltas goldPerMinDeltas;
    @SerializedName("damageTakenPerMinDeltas")
    @Expose
    private CDamageTakenPerMinDeltas damageTakenPerMinDeltas;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("lane")
    @Expose
    private String lane;
    private final static long serialVersionUID = -8726599257712503514L;

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public CTimeline withParticipantId(Long participantId) {
        this.participantId = participantId;
        return this;
    }

    public CCreepsPerMinDeltas getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public void setCreepsPerMinDeltas(CCreepsPerMinDeltas creepsPerMinDeltas) {
        this.creepsPerMinDeltas = creepsPerMinDeltas;
    }

    public CTimeline withCreepsPerMinDeltas(CCreepsPerMinDeltas creepsPerMinDeltas) {
        this.creepsPerMinDeltas = creepsPerMinDeltas;
        return this;
    }

    public CXpPerMinDeltas getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }

    public void setXpPerMinDeltas(CXpPerMinDeltas xpPerMinDeltas) {
        this.xpPerMinDeltas = xpPerMinDeltas;
    }

    public CTimeline withXpPerMinDeltas(CXpPerMinDeltas xpPerMinDeltas) {
        this.xpPerMinDeltas = xpPerMinDeltas;
        return this;
    }

    public CGoldPerMinDeltas getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public void setGoldPerMinDeltas(CGoldPerMinDeltas goldPerMinDeltas) {
        this.goldPerMinDeltas = goldPerMinDeltas;
    }

    public CTimeline withGoldPerMinDeltas(CGoldPerMinDeltas goldPerMinDeltas) {
        this.goldPerMinDeltas = goldPerMinDeltas;
        return this;
    }

    public CDamageTakenPerMinDeltas getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    public void setDamageTakenPerMinDeltas(CDamageTakenPerMinDeltas damageTakenPerMinDeltas) {
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
    }

    public CTimeline withDamageTakenPerMinDeltas(CDamageTakenPerMinDeltas damageTakenPerMinDeltas) {
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
        return this;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public CTimeline withRole(String role) {
        this.role = role;
        return this;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public CTimeline withLane(String lane) {
        this.lane = lane;
        return this;
    }
}
