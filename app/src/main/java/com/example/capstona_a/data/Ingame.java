package com.example.capstona_a.data;

import java.util.List;
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
public class Ingame {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;


    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("players")
    @Expose
    private List<Player> players;


}