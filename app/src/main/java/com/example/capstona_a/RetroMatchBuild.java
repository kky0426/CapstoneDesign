package com.example.capstona_a;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroMatchBuild {
    private static RetroMatchBuild Instance2 = new RetroMatchBuild();

    public static RetroMatchBuild getInstance2() {
        return Instance2;
    }

    private RetroMatchBuild() {

    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://kr.api.riotgames.com/lol/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GetMatchService service1 = retrofit.create(GetMatchService.class);
    public GetMatchService getService(){
        return service1;
    }
}
