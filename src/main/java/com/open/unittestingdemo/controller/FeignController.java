package com.open.unittestingdemo.controller;

import com.open.unittestingdemo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign模块<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: 玖富<p>
 *
 * @author wuchp
 * @since 2018/11/26 17:38
 */
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
