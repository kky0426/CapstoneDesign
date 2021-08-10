package com.example.capstona_a;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CMatchData {

    @SerializedName("matches")
    @Expose
    private List<CMatch> CMatches = null;
    @SerializedName("startIndex")
    @Expose
    private int startIndex;
    @SerializedName("endIndex")
    @Expose
    private int endIndex;
    @SerializedName("totalGames")
    @Expose
    private int totalGames;

    public List<CMatch> getMatches() {
        return CMatches;
    }

    public void setMatches(List<CMatch> CMatches) {
        this.CMatches = CMatches;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }
}
