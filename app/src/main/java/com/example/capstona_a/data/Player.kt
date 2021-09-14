package com.example.capstona_a.data

import android.icu.text.StringPrepParseException
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

    @SerializedName("wins")
    @Expose
    private val wins: Double? = null,

    @SerializedName("losses")
    @Expose
    private val losses: Double? = null,

    @SerializedName("tier")
    @Expose
    private val tier: String? = null,

    @SerializedName("rank")
    @Expose
    private val rank: String? = null,
) {
    fun nametoString(): String {
        return "$summonerName"
    }
    fun Spell1toString(): String{
        return "$fstSpellId"
    }
    fun Spell2toString(): String{
        return "$scnSpellId"
    }
    fun champIdtoString(): String{
        return  "$championId"
    }
    fun avgStatstoString(): String{
        return  "$avgStats"
    }
    fun accountIdtoString(): String{
        return "$accountId"
    }
    fun getavgStats(): AvgStats?{
        return this.avgStats;
    }
    fun tiertoString(): String{
        return "$tier"
    }
    fun tierranktoString(): String{
        return "$rank"
    }
    fun wintoint(): Double?{
        return wins
    }
    fun losstoint(): Double?{
        return losses;
    }

}