package com.iscoresports.teamplayersapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rmuhamed on sábado.
 */
public abstract class ModelObject {
    @SerializedName("Id")
    @Expose
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
