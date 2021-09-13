package com.greenfoxacademy.demo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FilipsHello {

    private static AtomicLong greetCount = new AtomicLong(0);
    private static String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/filip")
    public String greeting(Model model, @RequestParam String name, @RequestParam String color, @RequestParam int size) {
        model.addAttribute("name", name);
        model.addAttribute("color", color);
        model.addAttribute("size", size);
        model.addAttribute("greetCount", greetCount.incrementAndGet());
        model.addAttribute("hello", randomHello());
        return "Color";
    }

    private String randomHello() {
        return hellos[new Random().nextInt(hellos.length)];
    }

}

