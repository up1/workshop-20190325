package com.example.java_framework.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HelloResponse sayHi(@PathVariable String name) {
        return generateSuccessResponse();
    }

    private HelloResponse generateSuccessResponse() {
        HelloResponse response = new HelloResponse();
        response.setHeader(new Header(200L, "Success"));
        response.setBody(new Body("Hello Somkiat"));
        return response;
    }

}
