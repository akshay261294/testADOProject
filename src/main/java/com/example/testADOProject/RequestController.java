package com.example.testADOProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping
    public String helloWorld(){
        return "hello World";
    }
}
