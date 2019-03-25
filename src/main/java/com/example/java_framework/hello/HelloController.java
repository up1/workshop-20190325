package com.example.java_framework.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public HelloResponse sayHi(@PathVariable String name) {
        // TODO Next
        return helloService.generateSuccessResponse(name);
    }


}
