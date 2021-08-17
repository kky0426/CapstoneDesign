package com.example.capstona_a.retrofit;

import com.example.capstona_a.data.CMatchData;
import com.example.capstona_a.data.CUserDTO;
import com.example.capstona_a.data.CuserLeagueEntryDTO;

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


    @GET("match/v4/matchlists/by-account/{encryptedAccountId}")
    Call<CMatchData>getMatchId(@Path("encryptedAccountId")String encryptedAccountId, @Query("api_key")String api_key);


}

