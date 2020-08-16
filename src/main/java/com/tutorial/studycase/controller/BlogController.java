package com.tutorial.studycase.controller;

import com.tutorial.studycase.domain.Blog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {

    private static Map<String, Blog> blogRepo = new HashMap<>();
    static {
        Blog honey = new Blog();
        honey.setId((long) 1);
        honey.setName("Honey");
        blogRepo.put(honey.getId().toString(), honey);

        Blog almond = new Blog();
        almond.setId((long) 2);
        almond.setName("Almond");
        blogRepo.put(almond.getId().toString(), almond);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/blogs")
    public ResponseEntity<Object> getBlogs() {
        return new ResponseEntity<>(blogRepo.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/blogs", method = RequestMethod.POST)
    public ResponseEntity<Object> createBlog(@RequestBody Blog blog) {
        blogRepo.put(blog.getId().toString(), blog);
        System.out.println(blog);
        return new ResponseEntity<>("blog is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateBlog(@PathVariable("id") String id, @RequestBody Blog blog) {
        blogRepo.remove(id);
        blog.setId(Long.valueOf(id));
        blogRepo.put(id, blog);
        return new ResponseEntity<>("blog is updated successsfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        blogRepo.remove(id);
        return new ResponseEntity<>("blog is deleted successsfully", HttpStatus.OK);
    }
}
