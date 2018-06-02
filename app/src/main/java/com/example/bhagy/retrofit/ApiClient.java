package com.example.bhagy.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bhagy on 5/6/2018.
 */

public class ApiClient {

    public  static final String BASE_URL = "http://samples.openweathermap.org/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit == null){

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }


        return retrofit;
    }
}
