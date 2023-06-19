package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemoController {
@GetMapping("/welcome")
    public String hello(){
        return "helloo world";
    }
}
