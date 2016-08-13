
package com.iscoresports.teamplayersapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Adult extends ModelObject {
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
    private Object sex;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Addresses")
    @Expose
    private List<Object> addresses = new ArrayList<Object>();
    @SerializedName("Emails")
    @Expose
    private List<Object> emails = new ArrayList<Object>();
    @SerializedName("Phones")
    @Expose
    private List<Object> phones = new ArrayList<Object>();
    @SerializedName("Adults")
    @Expose
    private List<Object> adults = new ArrayList<Object>();
    @SerializedName("EmergencyContacts")
    @Expose
    private List<Object> emergencyContacts = new ArrayList<Object>();
    @SerializedName("HasMedicalInfo")
    @Expose
    private Boolean hasMedicalInfo;
    @SerializedName("MedicalInfo")
    @Expose
    private Object medicalInfo;
    @SerializedName("PrimaryAddress")
    @Expose
    private Object primaryAddress;
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
    public Object getSex() {
        return sex;
    }

    /**
     * 
     * @param sex
     *     The Sex
     */
    public void setSex(Object sex) {
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
     *     The addresses
     */
    public List<Object> getAddresses() {
        return addresses;
    }

    /**
     * 
     * @param addresses
     *     The Addresses
     */
    public void setAddresses(List<Object> addresses) {
        this.addresses = addresses;
    }

    /**
     * 
     * @return
     *     The emails
     */
    public List<Object> getEmails() {
        return emails;
    }

    /**
     * 
     * @param emails
     *     The Emails
     */
    public void setEmails(List<Object> emails) {
        this.emails = emails;
    }

    /**
     * 
     * @return
     *     The phones
     */
    public List<Object> getPhones() {
        return phones;
    }

    /**
     * 
     * @param phones
     *     The Phones
     */
    public void setPhones(List<Object> phones) {
        this.phones = phones;
    }

    /**
     * 
     * @return
     *     The adults
     */
    public List<Object> getAdults() {
        return adults;
    }

    /**
     * 
     * @param adults
     *     The Adults
     */
    public void setAdults(List<Object> adults) {
        this.adults = adults;
    }

    /**
     * 
     * @return
     *     The emergencyContacts
     */
    public List<Object> getEmergencyContacts() {
        return emergencyContacts;
    }

    /**
     * 
     * @param emergencyContacts
     *     The EmergencyContacts
     */
    public void setEmergencyContacts(List<Object> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    /**
     * 
     * @return
     *     The hasMedicalInfo
     */
    public Boolean getHasMedicalInfo() {
        return hasMedicalInfo;
    }

    /**
     * 
     * @param hasMedicalInfo
     *     The HasMedicalInfo
     */
    public void setHasMedicalInfo(Boolean hasMedicalInfo) {
        this.hasMedicalInfo = hasMedicalInfo;
    }

    /**
     * 
     * @return
     *     The medicalInfo
     */
    public Object getMedicalInfo() {
        return medicalInfo;
    }

    /**
     * 
     * @param medicalInfo
     *     The MedicalInfo
     */
    public void setMedicalInfo(Object medicalInfo) {
        this.medicalInfo = medicalInfo;
    }

    /**
     * 
     * @return
     *     The primaryAddress
     */
    public Object getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * 
     * @param primaryAddress
     *     The PrimaryAddress
     */
    public void setPrimaryAddress(Object primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
