package com.example.java_framework.hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HelloService helloService;

    @Test
    public void aaaa() throws Exception {
        // Test double :: stub
        HelloResponse expectedResponse = new HelloResponse();
        expectedResponse.setHeader(new Header(200L, "Success"));
        expectedResponse.setBody(new Body("Hello Xxx"));
        given(helloService.generateSuccessResponse("xxx"))
                .willReturn(expectedResponse);


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