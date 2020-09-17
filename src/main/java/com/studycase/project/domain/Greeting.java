package com.studycase.project.domain;

public class Greeting {
    private String textGreeting;

    public Greeting(String textGreeting) {
        this.textGreeting = textGreeting;
    }

    public Greeting() {
    }

    public String getTextGreeting() {
        return textGreeting;
    }

    public void setTextGreeting(String textGreeting) {
        this.textGreeting = textGreeting;
    }
}
