package com.annotion.entity;

import com.annotion.FieldAnnotation;
import com.annotion.MyAnnotation;
import com.annotion.TestAnnoton;

@TestAnnoton("dsd")
@MyAnnotation("db_user")
public class People {

    @FieldAnnotation("user_name")
    private String name;

    private String age;


    private String id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
