package com.greenfoxacademy.demo.controlers;

import com.greenfoxacademy.demo.OtherClasses.SayHello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {


    @RequestMapping(value = "/hello/color")
    public String hello(
            @RequestParam(defaultValue = "15") Integer size,
            @RequestParam(defaultValue = "0") Integer colorR,
            @RequestParam(defaultValue = "0") Integer colorG,
            @RequestParam(defaultValue = "0") Integer colorB,
            Model model) {

        SayHello sayHello = new SayHello();
        sayHello.randomHello();
        // collecting numbers to be inserted into the Color obj of SayHello object
        sayHello.setColorR(colorR);
        sayHello.setColorG(colorG);
        sayHello.setColorB(colorB);

        sayHello.setFontSize(size);
        model.addAttribute("wordHello", sayHello.toString());
        model.addAttribute()

        return "sayHello";
    }
}
