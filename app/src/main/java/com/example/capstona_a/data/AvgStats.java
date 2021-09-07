package com.example.capstona_a.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AvgStats {

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


}