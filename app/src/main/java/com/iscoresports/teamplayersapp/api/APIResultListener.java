package com.iscoresports.teamplayersapp.api;

/**
 * Created by rmuhamed on domingo.
 */
public interface APIResultListener<T> {
    void onSuccess(T result);

    void onError();
}
