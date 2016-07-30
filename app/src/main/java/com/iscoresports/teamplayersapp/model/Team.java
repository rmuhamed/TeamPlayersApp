
package com.iscoresports.teamplayersapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Team {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("WebsiteURI")
    @Expose
    private String websiteURI;
    @SerializedName("DivisionId")
    @Expose
    private Integer divisionId;
    @SerializedName("DivisionName")
    @Expose
    private String divisionName;
    @SerializedName("SessionId")
    @Expose
    private Integer sessionId;
    @SerializedName("SessionName")
    @Expose
    private String sessionName;
    @SerializedName("SessionBegins")
    @Expose
    private String sessionBegins;
    @SerializedName("SessionEnds")
    @Expose
    private String sessionEnds;
    @SerializedName("LeagueName")
    @Expose
    private String leagueName;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Zip")
    @Expose
    private String zip;
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
    @SerializedName("StatusTimestamp")
    @Expose
    private String statusTimestamp;
    @SerializedName("Settings")
    @Expose
    private Settings settings;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     *     The websiteURI
     */
    public String getWebsiteURI() {
        return websiteURI;
    }

    /**
     * 
     * @param websiteURI
     *     The WebsiteURI
     */
    public void setWebsiteURI(String websiteURI) {
        this.websiteURI = websiteURI;
    }

    /**
     * 
     * @return
     *     The divisionId
     */
    public Integer getDivisionId() {
        return divisionId;
    }

    /**
     * 
     * @param divisionId
     *     The DivisionId
     */
    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    /**
     * 
     * @return
     *     The divisionName
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * 
     * @param divisionName
     *     The DivisionName
     */
    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    /**
     * 
     * @return
     *     The sessionId
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * 
     * @param sessionId
     *     The SessionId
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 
     * @return
     *     The sessionName
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * 
     * @param sessionName
     *     The SessionName
     */
    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    /**
     * 
     * @return
     *     The sessionBegins
     */
    public String getSessionBegins() {
        return sessionBegins;
    }

    /**
     * 
     * @param sessionBegins
     *     The SessionBegins
     */
    public void setSessionBegins(String sessionBegins) {
        this.sessionBegins = sessionBegins;
    }

    /**
     * 
     * @return
     *     The sessionEnds
     */
    public String getSessionEnds() {
        return sessionEnds;
    }

    /**
     * 
     * @param sessionEnds
     *     The SessionEnds
     */
    public void setSessionEnds(String sessionEnds) {
        this.sessionEnds = sessionEnds;
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
     *     The zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * 
     * @param zip
     *     The Zip
     */
    public void setZip(String zip) {
        this.zip = zip;
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

    /**
     * 
     * @return
     *     The statusTimestamp
     */
    public String getStatusTimestamp() {
        return statusTimestamp;
    }

    /**
     * 
     * @param statusTimestamp
     *     The StatusTimestamp
     */
    public void setStatusTimestamp(String statusTimestamp) {
        this.statusTimestamp = statusTimestamp;
    }

    /**
     * 
     * @return
     *     The settings
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * 
     * @param settings
     *     The Settings
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
