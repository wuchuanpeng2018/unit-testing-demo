package com.open.unittestingdemo.controller;

import com.open.unittestingdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWeb {

    @RequestMapping("/helloWeb")
    public User helloWeb() {
        User user = new User();
        user.setUserName("wcp");
        user.setPwd("wu012390");
        return user;
    }

}
