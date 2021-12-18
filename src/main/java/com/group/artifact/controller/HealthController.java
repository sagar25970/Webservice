package com.group.artifact.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@Controller
public class HealthController {

    @GetMapping(value = "/health")
    public ResponseEntity<String> healthCheck() {
        log.info("Service pinged");
        return new ResponseEntity<>("Health Status: OK", OK);
    }
}
