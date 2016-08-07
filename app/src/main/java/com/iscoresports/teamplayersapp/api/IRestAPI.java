package com.iscoresports.teamplayersapp.api;

import com.iscoresports.teamplayersapp.model.Team;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rmuhamed on domingo.
 */
public interface IRestAPI {
    @GET("team.json")
    Call<Team> getTeam();

    @GET("tapped.php?teamid={teamid}&playerid={playerid}&firstname={PlayerFirstName}&lastname={PlayerLastName}")
    String getPlayerInfo();

}
