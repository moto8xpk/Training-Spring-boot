package com.studycase.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/view-blogs")
    public String viewBlogs() {
        return "view-blogs";
    }
    @RequestMapping("/add-blogs")
    public String addBlogs() {
        return "add-blogs";
    }
}
