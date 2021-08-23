package com.example.capstona_a.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CSpectatorDTO {

    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("player_1")
    @Expose
    private CSpecPlayer player1;
    @SerializedName("player_2")
    @Expose
    private CSpecPlayer player2;
    @SerializedName("player_3")
    @Expose
    private CSpecPlayer player3;
    @SerializedName("player_4")
    @Expose
    private CSpecPlayer player4;
    @SerializedName("player_5")
    @Expose
    private CSpecPlayer player5;
    @SerializedName("player_6")
    @Expose
    private CSpecPlayer player6;
    @SerializedName("player_7")
    @Expose
    private CSpecPlayer player7;
    @SerializedName("player_8")
    @Expose
    private CSpecPlayer player8;
    @SerializedName("player_9")
    @Expose
    private CSpecPlayer player9;
    @SerializedName("player_10")
    @Expose
    private CSpecPlayer player10;

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public CSpecPlayer getPlayer1() {
        return player1;
    }

    public void setPlayer1(CSpecPlayer player1) {
        this.player1 = player1;
    }

    public CSpecPlayer getPlayer2() {
        return player2;
    }

    public void setPlayer2(CSpecPlayer player2) {
        this.player2 = player2;
    }

    public CSpecPlayer getPlayer3() {
        return player3;
    }

    public void setPlayer3(CSpecPlayer player3) {
        this.player3 = player3;
    }

    public CSpecPlayer getPlayer4() {
        return player4;
    }

    public void setPlayer4(CSpecPlayer player4) {
        this.player4 = player4;
    }

    public CSpecPlayer getPlayer5() {
        return player5;
    }

    public void setPlayer5(CSpecPlayer player5) {
        this.player5 = player5;
    }

    public CSpecPlayer getPlayer6() {
        return player6;
    }

    public void setPlayer6(CSpecPlayer player6) {
        this.player6 = player6;
    }

    public CSpecPlayer getPlayer7() {
        return player7;
    }

    public void setPlayer7(CSpecPlayer player7) {
        this.player7 = player7;
    }

    public CSpecPlayer getPlayer8() {
        return player8;
    }

    public void setPlayer8(CSpecPlayer player8) {
        this.player8 = player8;
    }

    public CSpecPlayer getPlayer9() {
        return player9;
    }

    public void setPlayer9(CSpecPlayer player9) {
        this.player9 = player9;
    }

    public CSpecPlayer getPlayer10() {
        return player10;
    }

    public void setPlayer10(CSpecPlayer player10) {
        this.player10 = player10;
    }
}