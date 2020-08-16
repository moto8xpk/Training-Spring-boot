package com.tutorial.studycase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }
}
