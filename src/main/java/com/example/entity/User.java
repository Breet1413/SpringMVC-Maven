package com.example.entity;

import com.example.base.DataEntity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/23.
 */
public class User  extends DataEntity<User> {
    private Integer id;

    private String name;//姓名

    private String sex;//性别

    private Integer age;//年龄

    public User() {
        super();
    }

    public User(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public User(String name, String sex, Integer age) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public User(Integer id,String name, String sex, Integer age) {
        super();
        this.id= id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }

}
