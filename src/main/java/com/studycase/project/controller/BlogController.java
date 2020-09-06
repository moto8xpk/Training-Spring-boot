package com.studycase.project.controller;

import com.studycase.project.Service.BlogService;
import com.studycase.project.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/blogs")
    public ResponseEntity<Object> getBlog() {
        return new ResponseEntity<>(blogService.getBlogs(), HttpStatus.OK);
    }
    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateBlog(@PathVariable("id") String id, @RequestBody Blog blog) {

        blogService.updateBlog(id, blog);
        return new ResponseEntity<>("Blog is updated successsfully", HttpStatus.OK);
    }
    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        blogService.deleteBlog(id);
        return new ResponseEntity<>("Blog is deleted successsfully", HttpStatus.OK);
    }
    @RequestMapping(value = "/blogs", method = RequestMethod.POST)
    public ResponseEntity<Object> createBlog(@RequestBody Blog product) {
        blogService.createBlog(product);
        return new ResponseEntity<>("Blog is created successfully", HttpStatus.CREATED);
    }
//    @RequestMapping(value = "/")
//    public String hello() {
//        return "Hello World";
//    }
}
