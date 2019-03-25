package com.example.java_framework.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HelloResponse sayHi(@PathVariable String name) {
        // TODO Next
        return generateSuccessResponse(name);
    }

    private HelloResponse generateSuccessResponse(String name) {
        HelloResponse response = new HelloResponse();
        response.setHeader(new Header(200L, "Success"));
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        response.setBody(new Body("Hello " + name));
        return response;
    }

}
