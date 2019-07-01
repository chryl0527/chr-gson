package com.chryl.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 1.
 * com.google.gson.annotations.SerializedName;
 * 该注解使gson转换的json串指定为 想要的格式.
 * "firstName": "chr"
 * "first_name": "chr"
 * <p>
 * 2.
 * com.google.gson.annotations.Expose;
 * 属性不希望被接入:@Expose
 * 注意如果是内部对象的话,需要内部外部都要加该注解才能保证内部对象是否接入
 * <p>
 * Created By Chr on 2019/6/28.
 */

public class FullName implements Serializable {
    private static final long serialVersionUID = -2593311365785253616L;

    /**
     * 属性接入:
     * 1.属性加上transient修饰符修饰：属性不希望被实例化
     * 2.@Expose(serialize = true, deserialize = true),该注解也可以
     */
    @Expose(serialize = true, deserialize = true)
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
