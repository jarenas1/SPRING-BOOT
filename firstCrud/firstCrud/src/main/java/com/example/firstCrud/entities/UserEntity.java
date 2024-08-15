package com.example.firstCrud.entities;

public class UserEntity {
    String name;
    String age;

    public UserEntity() {
    }

    public UserEntity(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
