package com.java.user_module.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    Long userId;
    String name;
    String phoneNo;


    List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String name, String phoneNo, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.contacts = contacts;
    }

    public User( Long userId, String name, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public User() {
    }

    public Long getuserId() {
        return userId;
    }

    public void  setuserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void  setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n userId=" + userId +
                ",\n name='" + name + '\'' +
                ",\n phoneNo='" + phoneNo + '\'' +
                ",\n contacts=" + contacts +
                '}';
    }
}
