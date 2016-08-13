package com.iscoresports.teamplayersapp.api;

import com.iscoresports.teamplayersapp.model.ModelObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rmuhamed on domingo.
 */
public interface IRestAPI<T extends ModelObject> {
    @GET("team.json")
    Call<T> getTeam();
}
