package com.example.capstona_a.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Player(

    @SerializedName("summonerName")
    @Expose
    private val summonerName: String? = null,

    @SerializedName("fstSpellId")
    @Expose
    private val fstSpellId: Int? = null,

    @SerializedName("scnSpellId")
    @Expose
    private val scnSpellId: Int? = null,

    @SerializedName("championId")
    @Expose
    private val championId: Int? = null,

    @SerializedName("avgStats")
    @Expose
    private val avgStats: AvgStats? = null,

    @SerializedName("accountId")
    @Expose
    private val accountId: String? = null,
)