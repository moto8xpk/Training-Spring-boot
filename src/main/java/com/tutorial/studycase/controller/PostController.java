package com.tutorial.studycase.controller;

import com.tutorial.studycase.domain.Post;
import com.tutorial.studycase.exception.PostNotfoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@ControllerAdvice
public class PostController {
    private static Map<String, Post> postRepo = new HashMap<>();
    static {
        Post honey = new Post();
        honey.setId("1");
        honey.setName("Honey");
        postRepo.put(honey.getId(), honey);

        Post almond = new Post();
        almond.setId("2");
        almond.setName("Almond");
        postRepo.put(almond.getId(), almond);
    }

    @ExceptionHandler(value = PostNotfoundException.class)
    public ResponseEntity<Object> exception(PostNotfoundException exception) {
        return new ResponseEntity<>("Post not found", HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updatePost(@PathVariable("id") String id, @RequestBody Post post) {
        if(!postRepo.containsKey(id))throw new PostNotfoundException();
        postRepo.remove(id);
        post.setId(id);
        postRepo.put(id, post);
        return new ResponseEntity<>("post is updated successfully", HttpStatus.OK);
    }
}
