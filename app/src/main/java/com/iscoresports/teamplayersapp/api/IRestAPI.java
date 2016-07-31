package com.iscoresports.teamplayersapp.api;

import com.iscoresports.teamplayersapp.model.Team;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rmuhamed on domingo.
 */
public interface IRestAPI {
    @GET("team.json")
    Call<Team> getTeam();
}
