package com.group.artifact.service;

import com.group.artifact.model.Request;
import com.group.artifact.model.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleServiceTest {

    public static final int GIVEN_REQUEST_ID = 1;
    public static final String GIVEN_SAMPLE_REQUEST_BODY = "Sample Request Body";

    @Autowired
    private SampleService sampleService;

    private Request request;
    private Response response;

    @Test
    public void testSampleService() {
        givenRequest(GIVEN_REQUEST_ID, GIVEN_SAMPLE_REQUEST_BODY);

        whenServiceIsCalled();

        assertEquals(GIVEN_REQUEST_ID, response.getResponseId());
        assertEquals(GIVEN_SAMPLE_REQUEST_BODY, response.getResponseBody());
    }

    private void whenServiceIsCalled() {
        response = sampleService.getResponse(request);
    }

    private void givenRequest(int id, String requestBody) {
        request = new Request(id, requestBody);
    }
}