package com.example.java_framework.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

        public HelloResponse generateSuccessResponse(String name) {
                throw new RuntimeException("Under construction");
//        HelloResponse response = new HelloResponse();
//        response.setHeader(new Header(200L, "Success"));
//        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//        response.setBody(new Body("Hello " + name));
//        return response;
    }
}
