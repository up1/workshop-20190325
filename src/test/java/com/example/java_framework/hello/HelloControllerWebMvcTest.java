package com.example.java_framework.hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void aaaa() throws Exception {
        MvcResult result = mockMvc.perform(
                get("/hello/xxx")).andReturn();
        String outputJson = result.getResponse()
                                  .getContentAsString();

        ObjectMapper mapper = new ObjectMapper();
        HelloResponse actualResponse
                = mapper.readValue(outputJson, HelloResponse.class);

        assertEquals("Hello Xxx",
                actualResponse.getBody().getResult());
    }


}