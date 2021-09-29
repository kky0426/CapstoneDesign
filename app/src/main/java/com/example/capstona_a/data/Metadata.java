package com.example.capstona_a.data;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata implements Serializable
{

    @SerializedName("dataVersion")
    @Expose
    private String dataVersion;
    @SerializedName("matchId")
    @Expose
    private String matchId;
    @SerializedName("participants")
    @Expose
    private List<String> participants = null;
    private final static long serialVersionUID = -4019528296500217304L;

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Metadata withDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Metadata withMatchId(String matchId) {
        this.matchId = matchId;
        return this;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public Metadata withParticipants(List<String> participants) {
        this.participants = participants;
        return this;
    }

}