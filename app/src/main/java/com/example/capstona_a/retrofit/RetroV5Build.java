package com.example.capstona_a.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroV5Build {
    private static RetroV5Build instance = new RetroV5Build();

    public static RetroV5Build getInstance() {
        return instance;
    }

    private RetroV5Build() { }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://asia.api.riotgames.com/lol/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    GetRetroService service = retrofit.create(GetRetroService.class);
    public GetRetroService getService(){
        return service;
    }
}
