package com.example.capstona_a.retrofit;

import com.example.capstona_a.data.CMatchV5;
import com.example.capstona_a.data.CSpectatorDTO;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.data.CuserLeagueEntryDTO;
import com.google.gson.JsonArray;

import java.util.Set;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface GetRetroService {

    @GET("summoner/v4/summoners/by-name/{summonerName}")
    Call<CUserDTO>getAcc_id(@Path("summonerName")String summonerName, @Query("api_key")String api_key);

    @GET("league/v4/entries/by-summoner/{encryptedSummonerId}")
    Call<Set<CuserLeagueEntryDTO>> getLeagueV4(@Path("encryptedSummonerId")String encryptedSummonerId, @Query("api_key")String api_key);


    @GET("match/v5/matches/by-puuid/{puuid}/ids?start=0&count=100")
    Call<JsonArray>getMatchId(@Path("puuid")String puuid, @Query("api_key")String api_key);

    @GET("spectator/v4/active-games/by-summoner/{encryptedSummonerId}")
    Call<CSpectatorDTO>getSpecdata(@Path("encryptedSummonerId")String encryptedSummonerId, @Query("api_key")String api_key);
    @GET("match/v5/matches/{gameId}")
    Call<CMatchV5>getMatchData_v5(@Path("gameId")String gameId,@Query("api_key")String api_key);

}

