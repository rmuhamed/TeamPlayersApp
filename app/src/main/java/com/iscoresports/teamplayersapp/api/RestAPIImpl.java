package com.iscoresports.teamplayersapp.api;

import com.iscoresports.teamplayersapp.model.Team;
import com.iscoresports.teamplayersapp.util.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.HTTP;


/**
 * Created by rmuhamed on domingo.
 */
public class RestAPIImpl implements Callback<Team> {
    private final APIResultListener listener;

    public RestAPIImpl(APIResultListener<Team> listener) {
        this.listener = listener;
    }

    public void getTeam() {
        IRestAPI restAPI =
                RetrofitConfiguration.getInstance().create(IRestAPI.class);

        Call<Team> call = restAPI.getTeam();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Team> call, Response<Team> response) {
        int statusCode = response.code();
        if (statusCode == Constants.HTTP_OK) {
           this.listener.onSuccess(response.body());
        } else {
            this.listener.onError();
        }
    }

    @Override
    public void onFailure(Call<Team> call, Throwable t) {
        this.listener.onError();
    }
}
