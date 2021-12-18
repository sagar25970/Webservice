package com.group.artifact.service;

import com.group.artifact.model.Request;
import com.group.artifact.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static org.springframework.http.HttpStatus.OK;

@Service
@Slf4j
public class SampleService {

    public Response getResponse(Request request) {
        int status = OK.value();
        int responseId = request.getRequestId();
        String responseBody = request.getRequestBody();
        Response response = new Response(status, responseId, responseBody);
        log.info("Response : " + response);
        return response;
    }
}
