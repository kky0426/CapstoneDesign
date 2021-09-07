package com.example.capstona_a.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServerBuild {

    private static RetroServerBuild instance = new RetroServerBuild();

    public static RetroServerBuild getInstance() {
        return instance;
    }

    private RetroServerBuild() { }

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30,TimeUnit.SECONDS)
            .writeTimeout(30,TimeUnit.SECONDS)
            .build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://ec2-18-222-187-16.us-east-2.compute.amazonaws.com:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build();
    GetServerService service = retrofit.create(GetServerService.class);
    public GetServerService getService(){
        return service;
    }
}
