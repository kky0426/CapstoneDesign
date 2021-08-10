package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CParticipantIdentity implements Serializable {
    @SerializedName("participantId")
    @Expose
    private int participantId;
    @SerializedName("player")
    @Expose
    private CPlayer player;
    private final static long serialVersionUID = -7461822114262165782L;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public CParticipantIdentity withParticipantId(int participantId) {
        this.participantId = participantId;
        return this;
    }

    public CPlayer getPlayer() {
        return player;
    }

    public void setPlayer(CPlayer player) {
        this.player = player;
    }

    public CParticipantIdentity withPlayer(CPlayer player) {
        this.player = player;
        return this;
    }


}
