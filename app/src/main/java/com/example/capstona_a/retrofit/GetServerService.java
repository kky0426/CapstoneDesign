package com.example.capstona_a.retrofit;

import com.example.capstona_a.data.Board;
import com.example.capstona_a.data.Ingame;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GetServerService {

    @POST("/board")
    Call<String> postBoard(@Body Map<String, String> data);

    @GET("/board")
    Call<List<Board>> getBoard();

    @GET("/lol/ingame/{name}")
    Call<Ingame> getIngameData(@Path("name") String name);
}
