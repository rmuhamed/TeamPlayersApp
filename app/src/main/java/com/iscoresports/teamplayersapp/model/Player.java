
package com.iscoresports.teamplayersapp.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Player {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("PersonId")
    @Expose
    private Integer personId;
    @SerializedName("LeagueId")
    @Expose
    private Integer leagueId;
    @SerializedName("Division")
    @Expose
    private Object division;
    @SerializedName("JerseyNumber")
    @Expose
    private String jerseyNumber;

    @Expose
    @SerializedName("Person")
    private Person person;

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
     *     The personId
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * 
     * @param personId
     *     The PersonId
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
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
     *     The division
     */
    public Object getDivision() {
        return division;
    }

    /**
     * 
     * @param division
     *     The Division
     */
    public void setDivision(Object division) {
        this.division = division;
    }

    /**
     * 
     * @return
     *     The jerseyNumber
     */
    public String getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * 
     * @param jerseyNumber
     *     The JerseyNumber
     */
    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     *
     * @return
     *     The person
     */
    public Person getPerson() {
        return person;
    }

    /**
     *
     * @param person
     *     The Person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

}
