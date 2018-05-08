package com.example.bhagy.retrofit;

import com.example.bhagy.retrofit.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by bhagy on 5/6/2018.
 */

public interface ApiInterface {

    @POST("data/2.5/history/city?id=2885679&type=hour&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<Response> getResponse();
}
