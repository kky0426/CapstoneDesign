package com.example.capstona_a.data;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CAvgStats {

    @SerializedName("kills")
    @Expose
    private Double kills;
    @SerializedName("deaths")
    @Expose
    private Double deaths;
    @SerializedName("assists")
    @Expose
    private Double assists;
    @SerializedName("gold")
    @Expose
    private Double gold;
    @SerializedName("damage_dealt")
    @Expose
    private Double damageDealt;
    @SerializedName("damage_taken")
    @Expose
    private Double damageTaken;
    @SerializedName("vision")
    @Expose
    private Double vision;
    @SerializedName("exp")
    @Expose
    private Double exp;

    public Double getKills() {
        return kills;
    }

    public void setKills(Double kills) {
        this.kills = kills;
    }

    public Double getDeaths() {
        return deaths;
    }

    public void setDeaths(Double deaths) {
        this.deaths = deaths;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Double getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(Double damageDealt) {
        this.damageDealt = damageDealt;
    }

    public Double getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(Double damageTaken) {
        this.damageTaken = damageTaken;
    }

    public Double getVision() {
        return vision;
    }

    public void setVision(Double vision) {
        this.vision = vision;
    }

    public Double getExp() {
        return exp;
    }

    public void setExp(Double exp) {
        this.exp = exp;
    }

}