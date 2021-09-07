package com.example.capstona_a.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AvgStats(

    @SerializedName("kills")
    @Expose
    val kills: Double? = null,

    @SerializedName("deaths")
    @Expose
    val deaths: Double? = null,

    @SerializedName("assists")
    @Expose
    val assists: Double? = null,

    @SerializedName("gold")
    @Expose
    val gold: Double? = null,

    @SerializedName("damage_dealt")
    @Expose
    val damageDealt: Double? = null,

    @SerializedName("damage_taken")
    @Expose
    val damageTaken: Double? = null,

    @SerializedName("vision")
    @Expose
    val vision: Double? = null,

    @SerializedName("exp")
    @Expose
    val exp: Double? = null,
)