
package com.iscoresports.teamplayersapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Team extends ModelObject {
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("LeagueName")
    @Expose
    private String leagueName;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("IsAllStar")
    @Expose
    private Boolean isAllStar;
    @SerializedName("LeagueId")
    @Expose
    private Integer leagueId;
    @SerializedName("Sport")
    @Expose
    private String sport;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Players")
    @Expose
    private List<Player> players = new ArrayList<Player>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

   /**
     * 
     * @return
     *     The leagueName
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * 
     * @param leagueName
     *     The LeagueName
     */
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The City
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The State
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The isAllStar
     */
    public Boolean getIsAllStar() {
        return isAllStar;
    }

    /**
     * 
     * @param isAllStar
     *     The IsAllStar
     */
    public void setIsAllStar(Boolean isAllStar) {
        this.isAllStar = isAllStar;
    }

    /**
     * 
     * @return
     *     The leagueId
     */
    public Integer getLeagueId() {
        return leagueId;
    }

    /**
     * 
     * @param leagueId
     *     The LeagueId
     */
    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    /**
     * 
     * @return
     *     The sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * 
     * @param sport
     *     The Sport
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * 
     * @param players
     *     The Players
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
