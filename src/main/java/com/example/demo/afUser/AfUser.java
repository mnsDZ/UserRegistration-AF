package com.example.demo.afUser;

import com.example.demo.afUser.validators.AdultUser;
import com.example.demo.afUser.validators.FrenchCountryUser;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import javax.validation.constraints.*;

/**
 * AfUser to register
 */
@Table(name = "AfUser")
@Entity(name = "AfUser")
public class  AfUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Username", length = 30)
    @NotEmpty @NotNull
    @JsonProperty("userName")
    private String userName;

    @Temporal(TemporalType.DATE)
    @AdultUser
    private Date dateOfBirth;

    @NotEmpty @NotNull
    @FrenchCountryUser
    private String country;

    @NotEmpty @NotNull
    private String phoneNumber;

    @Column(name = "Gender")
    private String gender;

    public AfUser(Long id, String userName, Date dateOfBirth, String country, String phoneNumber, String gender) {
        this.id = id;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AfUser(String userName, Date dateOfBirth, String country, String phoneNumber, String gender) {
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public AfUser() {
    }

    @Override
    public String toString() {
        return "AfUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
