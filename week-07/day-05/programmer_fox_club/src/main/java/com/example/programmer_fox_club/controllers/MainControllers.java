package com.example.programmer_fox_club.controllers;

import com.example.programmer_fox_club.models.Drink;
import com.example.programmer_fox_club.models.Food;
import com.example.programmer_fox_club.models.Fox;
import com.example.programmer_fox_club.models.Trick;
import com.example.programmer_fox_club.services.FoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {
    private FoxesService foxesService;
    private boolean aBoolean;


    @Autowired
    public MainControllers(FoxesService foxesService) {
        this.foxesService = foxesService;
        this.aBoolean = true;
    }

    // ------------HOME ----------------
    @GetMapping(value = "/index")
    public String index(Model model,
                        @RequestParam String name) {
        if(this.foxesService.findAFox(name) == null) {
            return "redirect:/create";
        }


        model.addAttribute("fox", this.foxesService.findAFox(name));


        return "index";
    }

    //------------LOGIN---------------------------------------------------
    @GetMapping(value = "/login")
    public String loginRender() {


        return "login";
    }


    @PostMapping(value = "/login")
    public String login(@RequestParam(required = false) String name) {


        if (this.foxesService.findAFox(name) == null || name == null) {

            foxesService.saveAFox(name);

        }


        return "redirect:/index?name=" + name;
    }
    // ---- MAKE NEW FOX -----------------------------------------------

//    @GetMapping(value = "/create")
//    public String create() {
//
//        return "create";
//    }
//
//    @PostMapping(value = "/create")
//    public String create(@RequestParam String name) {
//        if (name == null) {
//            this.aBoolean = false;
//        }
//        Fox fox = new Fox(name);
//        this.foxesService.saveAFox(fox);
//        this.aBoolean = true;
//
//
//        return "redirect:/index?name=" + name;
//    }

    // ------------INFO ----------------------
    @GetMapping(value = "/info")
    public String info(@RequestParam String name) {

        return "redirect:/index?name=" + name;
    }

}
