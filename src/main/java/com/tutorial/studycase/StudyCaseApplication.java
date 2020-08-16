package com.tutorial.studycase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudyCaseApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StudyCaseApplication.class);
    @Autowired
    RestTemplate restTemplate;

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
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
    }
}
