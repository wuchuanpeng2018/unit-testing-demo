package com.open.unittestingdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2018 XXX, Inc. All rights reserved. <p>
 * Company: 玖富<p>
 *
 * @author wuchp
 * @since 2018/11/26 17:38
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String Hello(@RequestParam(name = "name", required = false) String name) {
        return "hello world "+ name;
    }
}
