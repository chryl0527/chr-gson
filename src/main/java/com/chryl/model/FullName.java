package com.chryl.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * com.google.gson.annotations.SerializedName;
 * 该注解使gson转换的json串指定为 想要的格式,
 * "firstName": "chr"
 * "first_name": "chr"
 * <p>
 * Created By Chr on 2019/6/28.
 */

public class FullName implements Serializable {
    private static final long serialVersionUID = -2593311365785253616L;
    @SerializedName("first_name")
    private String firstName;
    private String middleName;
    private String lastName;

    public FullName() {
    }

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
