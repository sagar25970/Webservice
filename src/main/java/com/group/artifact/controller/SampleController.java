package com.group.artifact.controller;

import com.group.artifact.model.Request;
import com.group.artifact.model.Response;
import com.group.artifact.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @PostMapping(value = "/")
    public ResponseEntity<Response> sampleController(@RequestBody Request request) {
        log.info("Request Received : " + request);
        Response response = sampleService.getResponse(request);
        return new ResponseEntity<>(response, OK);
    }
}
