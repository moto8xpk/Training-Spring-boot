package com.studycase.project.controller;

import com.studycase.project.domain.Blog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BlogController {
    private static Map<String, Blog> blogRepo = new HashMap<>();
    static {
        Blog honey = new Blog();
        honey.setId("1");
        honey.setName("Honey");
        blogRepo.put(honey.getId(), honey);
        Blog almond = new Blog();
        almond.setId("2");
        almond.setName("Almond");
        blogRepo.put(almond.getId(), almond);
    }
    @RequestMapping(value = "/blogs")
    public ResponseEntity<Object> getBlogs() {
        return new ResponseEntity<>(blogRepo.values(), HttpStatus.OK);
    }
}