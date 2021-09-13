package com.greenfoxacademy.demo.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestControllers {
    private AtomicLong counter;

    public HelloRestControllers() {
        this.counter = new AtomicLong();
    }

    @RequestMapping(value = "/greeting")

    public Greeting greeting(@RequestParam(name = "name") String name) {
        Greeting greeting = new Greeting(name);
       greeting.setGreetingCounter(counter.getAndIncrement());

        return greeting;
    }
}
