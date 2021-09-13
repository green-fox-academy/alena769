package com.greenfoxacademy.demo.controlers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long greetingCounter;
    private String content;

    public Greeting(String name) {
        this.content = "Hello," + name;

    }

    public String getContent() {
        return content;
    }

    public long getGreetingCounter() {
        return greetingCounter;
    }

    public void setGreetingCounter(long greetingCounter) {
        this.greetingCounter = greetingCounter;
    }
}
