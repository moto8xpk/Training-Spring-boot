package com.tutorial.studycase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudyCaseApplication implements ApplicationRunner {

    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {

        SpringApplication.run(StudyCaseApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        //executed after run spring boot application
        System.out.println("Hello World from Application Runner - executed after run spring boot application");
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
