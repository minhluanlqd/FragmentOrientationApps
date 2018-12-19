package com.example.dell.fragmentorientation;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int dayofBirth;
    private String address;
    private String email;

    public Student(String name, int dayofBirth, String address, String email) {
        this.name = name;
        this.dayofBirth = dayofBirth;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayofBirth() {
        return dayofBirth;
    }

    public void setDayofBirth(int dayofBirth) {
        this.dayofBirth = dayofBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
