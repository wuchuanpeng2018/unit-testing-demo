package com.open.unittestingdemo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RestFulContollerTest {

    private  final  static String url =  "http://localhost:8080/";

    private static RestTemplate restTemplate = new RestTemplate();


    @Test
    public void getUserRest() {
        ResponseEntity<String> response = restTemplate.exchange(url + "/getUserRest" ,
                HttpMethod.GET,
                new HttpEntity(null),
                String.class);
        System.out.println("result: " + response.getBody());
    }
}