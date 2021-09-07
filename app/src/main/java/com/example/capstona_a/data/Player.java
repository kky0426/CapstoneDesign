package com.example.capstona_a.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    @SerializedName("summonerName")
    @Expose
    private String summonerName;
    @SerializedName("fstSpellId")
    @Expose
    private Integer fstSpellId;
    @SerializedName("scnSpellId")
    @Expose
    private Integer scnSpellId;
    @SerializedName("championId")
    @Expose
    private Integer championId;
    @SerializedName("avgStats")
    @Expose
    private AvgStats avgStats;
    @SerializedName("accountId")
    @Expose
    private String accountId;


}