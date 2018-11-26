package com.open.unittestingdemo.controller;

import com.open.unittestingdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: 玖富<p>
 *
 * @author wuchp
 * @since 2018/11/26 17:38
 */
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
