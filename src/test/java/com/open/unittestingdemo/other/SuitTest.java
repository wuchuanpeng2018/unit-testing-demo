package com.open.unittestingdemo.other;

import com.open.unittestingdemo.controller.HelloWebTest;
import com.open.unittestingdemo.controller.HelloWorldTest;
import com.open.unittestingdemo.controller.RestFulContollerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// 1. 更改测试运行方式为 Suite
@RunWith(Suite.class)
// 2. 将测试类传入进来
@Suite.SuiteClasses({HelloWebTest.class, HelloWorldTest.class, RestFulContollerTest.class})
public class SuitTest {
}
