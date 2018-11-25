package com.open.unittestingdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFulContoller {

    @RequestMapping("/helloRest")
    public String Hello(@RequestParam(name = "name", required = false) String name) {
        return "hello world "+ name;
    }
}
