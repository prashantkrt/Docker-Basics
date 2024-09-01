package com.mylearning.docker.deployment.dockerdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public ResponseEntity<String> greet() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
