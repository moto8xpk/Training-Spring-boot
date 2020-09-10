package com.studycase.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class BlogController {
    @Value("${text.greeting}")
    String welcomeText;

    @RequestMapping(value = "/")
    public String welcomeText() {
        return welcomeText;
    }
}
