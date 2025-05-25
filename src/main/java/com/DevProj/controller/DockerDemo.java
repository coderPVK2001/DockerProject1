package com.DevProj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DockerDemo {

    @GetMapping("/getpvk")
    public ResponseEntity getMessasge(){

        return new ResponseEntity("Hello WELCOME TO DOCKER PROJECT!!",HttpStatus.OK);

    }
}
