package com.open.unittestingdemo.controller;

import com.open.unittestingdemo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUserName("wcp");
        user.setPwd("wu012390");
        return user;
    }

}
