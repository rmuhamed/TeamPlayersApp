
package com.iscoresports.teamplayersapp.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Person {
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("AccountId")
    @Expose
    private Integer accountId;
    @SerializedName("UserId")
    @Expose
    private Integer userId;
    @SerializedName("HasPersonImage")
    @Expose
    private Boolean hasPersonImage;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("Nickname")
    @Expose
    private Object nickname;
    @SerializedName("MiddleName")
    @Expose
    private Object middleName;
    @SerializedName("RenderedBirthdate")
    @Expose
    private Object renderedBirthdate;
    @SerializedName("Birthdate")
    @Expose
    private Object birthdate;
    @SerializedName("PersonType")
    @Expose
    private Integer personType;
    @SerializedName("Sex")
    @Expose
    private String sex;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Adults")
    @Expose
    private List<Adult> adults = new ArrayList<Adult>();

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
     *     The accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     *
     * @param accountId
     *     The AccountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     *
     * @return
     *     The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     *     The UserId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     *     The hasPersonImage
     */
    public Boolean getHasPersonImage() {
        return hasPersonImage;
    }

    /**
     *
     * @param hasPersonImage
     *     The HasPersonImage
     */
    public void setHasPersonImage(Boolean hasPersonImage) {
        this.hasPersonImage = hasPersonImage;
    }

    /**
     *
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     *     The FirstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     *     The LastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     *     The nickname
     */
    public Object getNickname() {
        return nickname;
    }

    /**
     *
     * @param nickname
     *     The Nickname
     */
    public void setNickname(Object nickname) {
        this.nickname = nickname;
    }

    /**
     *
     * @return
     *     The middleName
     */
    public Object getMiddleName() {
        return middleName;
    }

    /**
     *
     * @param middleName
     *     The MiddleName
     */
    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    /**
     *
     * @return
     *     The renderedBirthdate
     */
    public Object getRenderedBirthdate() {
        return renderedBirthdate;
    }

    /**
     *
     * @param renderedBirthdate
     *     The RenderedBirthdate
     */
    public void setRenderedBirthdate(Object renderedBirthdate) {
        this.renderedBirthdate = renderedBirthdate;
    }

    /**
     *
     * @return
     *     The birthdate
     */
    public Object getBirthdate() {
        return birthdate;
    }

    /**
     *
     * @param birthdate
     *     The Birthdate
     */
    public void setBirthdate(Object birthdate) {
        this.birthdate = birthdate;
    }

    /**
     *
     * @return
     *     The personType
     */
    public Integer getPersonType() {
        return personType;
    }

    /**
     *
     * @param personType
     *     The PersonType
     */
    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    /**
     *
     * @return
     *     The sex
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param sex
     *     The Sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     *     The ImageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     *     The adults
     */
    public List<Adult> getAdults() {
        return adults;
    }

    /**
     *
     * @param adults
     *     The Adults
     */
    public void setAdults(List<Adult> adults) {
        this.adults = adults;
    }
}
