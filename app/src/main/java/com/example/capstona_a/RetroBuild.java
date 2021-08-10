package com.example.capstona_a;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroBuild {
    private static RetroBuild Instance = new RetroBuild();

    public static RetroBuild getInstance() {
        return Instance;
    }

    private RetroBuild() {

    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://kr.api.riotgames.com/lol/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GetRetroService service = retrofit.create(GetRetroService.class);
    public GetRetroService getService(){
        return service;
    }

}
