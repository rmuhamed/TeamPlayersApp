package com.iscoresports.teamplayersapp;

import android.app.Application;

import com.iscoresports.teamplayersapp.api.RetrofitConfiguration;

/**
 * Created by rmuhamed on sábado.
 */
public class TeamPlayersApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Setup third party components
        RetrofitConfiguration.initialize();
    }
}
