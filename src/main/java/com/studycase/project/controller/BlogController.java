package com.studycase.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @RequestMapping(value = "/")
    public String home() {
        return "Eureka Client application";
    }

}
