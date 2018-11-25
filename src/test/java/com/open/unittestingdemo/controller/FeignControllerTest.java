//package com.open.unittestingdemo.controller;
//
//import com.open.unittestingdemo.external.UserServiceClient;
//import com.open.unittestingdemo.model.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest()
//@Import({ FeignAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class })
//@EnableFeignClients(clients = FeignControllerTest.UserServiceFeignClient.class)
//public class FeignControllerTest {
//
//	@FeignClient(value = "test", url = "http://localhost:8080/")
//	public interface UserServiceFeignClient extends UserServiceClient {
//	}
//
//	@Autowired
//	private UserServiceFeignClient userServiceFeignClient;
//
//	@Test
//	public void getUser() {
//		User user = userServiceFeignClient.getUser();
//		System.out.println(user);
//	}
//
//}
