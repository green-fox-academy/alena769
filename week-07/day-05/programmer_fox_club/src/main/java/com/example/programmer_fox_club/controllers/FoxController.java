package com.example.programmer_fox_club.controllers;

import com.example.programmer_fox_club.models.Drink;
import com.example.programmer_fox_club.models.Food;
import com.example.programmer_fox_club.models.Fox;
import com.example.programmer_fox_club.models.Trick;
import com.example.programmer_fox_club.services.FoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {
    private FoxesService foxesService;

    @Autowired
    public FoxController(FoxesService foxesService) {
        this.foxesService = foxesService;
    }

    //------Nutrition store ----------------------------------------------
    @GetMapping(value = "/nutrition")
    public String nutritionStore(Model model, @RequestParam String name) {
        model.addAttribute("listOfFood", Food.values());
        model.addAttribute("listOfDrinks", Drink.values());
        model.addAttribute("name", this.foxesService.findAFox(name).getName());


        return "nutrition";
    }

    @PostMapping(value = "/nutrition")
    public String nutritionAdd(@ModelAttribute Fox fox) {
       if(foxesService.findAFox(fox.getName()) != null){
           foxesService.updateFox(fox);
       }

        return "redirect:/index?name=" + fox.getName();
    }
    //------------Tricks --------------------------------------------------
    @GetMapping(value = "/tricks")
    public String tricks(Model model, @RequestParam String name) {
        model.addAttribute("tricks", foxesService.listTricks());
        model.addAttribute("name", foxesService.findAFox(name).getName());


        return "tricks";
    }

    @PostMapping(value = "/tricks")
    public String tricks(@RequestParam String trick,
                         @RequestParam String name) {
        this.foxesService.addTrick(name, trick);

        return "redirect:/index?name=" + name;
    }
}
