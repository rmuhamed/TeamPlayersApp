package com.iscoresports.teamplayersapp.api;

import android.util.Log;

import com.iscoresports.teamplayersapp.model.ModelObject;
import com.iscoresports.teamplayersapp.model.Team;
import com.iscoresports.teamplayersapp.util.Constants;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by rmuhamed on domingo.
 */
public class RestAPIImpl {
    private static final String LOG_TAG = RestAPIImpl.class.getSimpleName();

    public Team getTeam() {
        Team team = null;
        IRestAPI restAPI =
                RetrofitConfiguration.getInstance().create(IRestAPI.class);

        try {
            team = restAPI.getTeam().execute().body();
        } catch (IOException e) {
            Log.e(LOG_TAG, e.toString());
        }

        return team;
    }
}
