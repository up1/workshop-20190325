package com.example.java_framework.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class HelloControllerSpringBootTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void xxx() {
        HelloResponse response
                = this.restTemplate.getForObject("/hello/xxx",
                                                 HelloResponse.class);
        assertEquals("Hello Xxx", response.getBody().getResult());
    }

    @Test
    public void yyy() {
        HelloResponse response
                = this.restTemplate.getForObject("/hello/YyY",
                HelloResponse.class);
        assertEquals("Hello Yyy", response.getBody().getResult());
    }

}