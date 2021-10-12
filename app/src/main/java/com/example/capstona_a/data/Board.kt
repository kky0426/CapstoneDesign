package com.example.capstona_a.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Board(
    @SerializedName("id")
    @Expose
    val id: Long,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("content")
    @Expose
    val content: String,
)