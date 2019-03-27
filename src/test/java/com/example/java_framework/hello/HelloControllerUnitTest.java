package com.example.java_framework.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerUnitTest {

    @Mock
    private HelloService helloService;

    @Test
    public void bbbb() throws Exception {
        // Test double :: stub
        HelloResponse expectedResponse = new HelloResponse();
        expectedResponse.setHeader(new Header(200L, "Success"));
        expectedResponse.setBody(new Body("Hello Xxx"));
        given(helloService.generateSuccessResponse("xxx"))
                .willReturn(expectedResponse);

        HelloController controller
                = new HelloController(helloService);
        HelloResponse actualResponse = controller.sayHi("xxx");

        assertEquals("Hello Xxx",
                actualResponse.getBody().getResult());
    }

}