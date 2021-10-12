package com.example.capstona_a.retrofit;

import com.example.capstona_a.data.CMatchDetailDTO;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;

public interface GetMatchService {
    @GET("match/v4/matches/{matchId}")
    Call<CMatchDetailDTO> getMatchDetail(@Path("matchId")String matchId, @Query("api_key")String api_key);

    @GET("img/item/{ItemCode}.png")
    @Streaming
    Call<ResponseBody>downloadImage(@Path("ItemCode")String ItmeCode);
}
