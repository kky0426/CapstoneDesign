package com.example.capstona_a;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetMatchService {
    @GET("match/v4/matches/{matchId}")
    Call<CMatchDetailDTO> getMatchDetail(@Path("matchId")String matchId, @Query("api_key")String api_key);
}
