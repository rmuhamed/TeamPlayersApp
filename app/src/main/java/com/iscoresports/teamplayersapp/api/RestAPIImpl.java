package com.iscoresports.teamplayersapp.api;

import com.iscoresports.teamplayersapp.model.ModelObject;
import com.iscoresports.teamplayersapp.util.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by rmuhamed on domingo.
 */
public class RestAPIImpl<T extends ModelObject> {
    private final APIResultListener listener;

    public RestAPIImpl(APIResultListener<T> listener) {
        this.listener = listener;
    }

    public void getTeam() {
        IRestAPI restAPI =
                RetrofitConfiguration.getInstance().create(IRestAPI.class);

        Call<T> call = restAPI.getTeam();
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                int statusCode = response.code();
                if (statusCode == Constants.HTTP_OK) {
                    RestAPIImpl.this.listener.onSuccess((ModelObject) response.body());
                } else {
                    RestAPIImpl.this.listener.onError();
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                RestAPIImpl.this.listener.onError();
            }
        });
    }
}
