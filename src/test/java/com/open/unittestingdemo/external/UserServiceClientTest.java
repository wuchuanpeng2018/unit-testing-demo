package com.open.unittestingdemo.external;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class UserServiceClientTest {

    @Test(timeout = 1200)
    public void getUser() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }

    @Test(expected = NullPointerException.class)
    public void getUserNull() {
        throw new NullPointerException();
    }
}