package com.in28minutes.rest.webservices.restfulwebservices;

import java.time.LocalDate;

public class User {


    public int id;
    public String name;
    public LocalDate birth;


    public User(String name, LocalDate birth, int id) {
        super();
        this.name = name;
        this.birth = birth;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
