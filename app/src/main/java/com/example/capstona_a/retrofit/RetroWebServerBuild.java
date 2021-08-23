package com.example.capstona_a.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroWebServerBuild {
    private static RetroWebServerBuild Instance3= new RetroWebServerBuild();
    public static RetroWebServerBuild getInstance3(){ return Instance3;}
    private RetroWebServerBuild() {

    }


    OkHttpClient.Builder client= new OkHttpClient.Builder().connectTimeout(600, TimeUnit.SECONDS);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://ec2-18-191-25-39.us-east-2.compute.amazonaws.com:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build();
    GetRetroService service4= retrofit.create(GetRetroService.class);

    public GetRetroService getService4() {
        return service4;
    }
}
