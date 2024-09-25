package org.example.adapter;

import javax.naming.Name;

public class CollegeStudent implements Student {
    String name;
    String surName;

    public CollegeStudent(String name, String surName, String email) {
        this.name = name;
        this.surName = surName;
        this.email = email;
    }

    String email;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurName() {
        return surName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
