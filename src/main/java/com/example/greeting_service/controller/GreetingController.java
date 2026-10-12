package com.example.greeting_service.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    
    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello From Greeting Service");
    }
    
}
