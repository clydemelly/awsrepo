package com.example.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/home")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}