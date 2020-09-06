package com.studycase.project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @RequestMapping(value = "/")
    @CrossOrigin(origins = "*")
    public String hello1() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello")
    @CrossOrigin(origins = "http://localhost:8080")
    public String hello2() {
        return "Hello World";
    }
}
