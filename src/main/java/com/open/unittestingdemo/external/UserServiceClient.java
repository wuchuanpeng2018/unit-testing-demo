package com.open.unittestingdemo.external;


import com.open.unittestingdemo.model.User;

public class UserServiceClient {

    public User getUser() {
        User user = new User();
        user.setUserName("wcp");
        user.setPwd("wu012390");
        return user;
    }

}
