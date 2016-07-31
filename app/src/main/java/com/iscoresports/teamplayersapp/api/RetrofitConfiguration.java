package com.iscoresports.teamplayersapp.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rmuhamed on domingo.
 */
public final class RetrofitConfiguration {
    public static final String BASE_URL = "http://iscoresports.com/bcl/challenge/";

    private static Retrofit instance;

    public static Retrofit getInstance() {
        return instance;
    }

    public static void initialize() {
        instance = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
