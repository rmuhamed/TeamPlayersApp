package com.iscoresports.teamplayersapp.api;

import com.iscoresports.teamplayersapp.model.ModelObject;

/**
 * Created by rmuhamed on domingo.
 */
public interface APIResultListener<T extends ModelObject> {
    void onSuccess(T result);

    void onError();
}
