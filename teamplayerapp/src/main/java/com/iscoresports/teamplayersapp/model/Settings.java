
package com.iscoresports.teamplayersapp.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Settings {

    @SerializedName("TeamId")
    @Expose
    private Integer teamId;

    /**
     * 
     * @return
     *     The teamId
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * 
     * @param teamId
     *     The TeamId
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

}
