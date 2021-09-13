package com.greenfoxacademy.demo.OtherClasses;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SayHello {
    private List<String> hellos;
    private int fontSize;
    private Color color;
    private int colorR;
    private int colorG;
    private int colorB;

    public SayHello() {
        this.hellos = new ArrayList<>();
        Font font = new Font("Arial", Font.PLAIN, this.fontSize);
        Color colorObj = new Color(colorR,colorG,colorB);
        this.color = colorObj;
    }

    public void setColorR(int colorR) {
        this.colorR = colorR;
    }

    public void setColorG(int colorG) {
        this.colorG = colorG;
    }

    public void setColorB(int colorB) {
        this.colorB = colorB;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String randomHello() {
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
                "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom",
                "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit",
                "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
                "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam",
                "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        for (String h : hellos) {
            this.hellos.add(h);
        }
        Random random = new Random();

        return this.hellos.get(random.nextInt(this.hellos.size()));
    }
}
