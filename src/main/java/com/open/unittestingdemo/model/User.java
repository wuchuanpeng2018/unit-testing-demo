package com.open.unittestingdemo.model;


import lombok.Data;

@Data
public class User {

    private String userName;
    private String pwd;

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public User(){

    }
}
