package com.studycase.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class BlogServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    BlogServiceInterceptor blogServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(blogServiceInterceptor);
    }

}
