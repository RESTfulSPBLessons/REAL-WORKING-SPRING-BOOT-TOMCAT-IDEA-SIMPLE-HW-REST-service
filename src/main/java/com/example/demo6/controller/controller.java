package com.example.demo6.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello Spring Boot!!";
    }



}
