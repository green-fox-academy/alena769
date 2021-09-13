package com.greenfoxacademy.demo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetController {

    private AtomicLong counter;

    public WebGreetController() {
        this.counter = new AtomicLong();
    }

    @RequestMapping(value = "/web/greeting1")
    public String greeting(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name",name);
        model.addAttribute("counter", this.counter.getAndIncrement());
        return "webGreet";
    }
}
