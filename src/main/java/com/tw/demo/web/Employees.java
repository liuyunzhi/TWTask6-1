package com.tw.demo.web;

public class Employees {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Employees(Integer id, String name, Integer age, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
