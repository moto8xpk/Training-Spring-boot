package com.tutorial.studycase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudyCaseApplication implements CommandLineRunner {

    @Autowired
    RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String name;

    @Value("${spring.application.news: hellowall }")
    private String news;

    public static void main(String[] args) {

        SpringApplication.run(StudyCaseApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Override
    public void run(String... args) throws Exception {
        // this cmd run after tomcat started
        System.out.println("Hello world from Command Line Runner");
        System.out.println(name);
        System.out.println(news);
    }
}
