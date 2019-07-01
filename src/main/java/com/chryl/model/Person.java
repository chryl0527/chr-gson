package com.chryl.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * com.google.gson.annotations.Expose;
 * <p>
 * 在 序列化 和 反序列化 时，要不要将该字段接入操作:就是gson只接入标有该注解的字段,如果没有就不转化
 * 该注解:要配合new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();使用
 *
 * @Expose(serialize = true, deserialize = true)
 * <p>
 * Created By Chr on 2019/6/28.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 3473792054110446622L;
    private String name;
    //是否接入:序列化和反序列化
    @Expose(serialize = true, deserialize = true)
    private FullName fullName;
    private int age;
    private Date birthday;
    private List<String> hobbies;
    private Map<String, String> clothes;
    private List<Person> friends;

    public Person() {
    }

    public Person(String name, FullName fullName, int age, Date birthday, List<String> hobbies, Map<String, String> clothes, List<Person> friends) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.birthday = birthday;
        this.hobbies = hobbies;
        this.clothes = clothes;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getClothes() {
        return clothes;
    }

    public void setClothes(Map<String, String> clothes) {
        this.clothes = clothes;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName=" + fullName +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", clothes=" + clothes +
                ", friends=" + friends +
                '}';
    }
}