package com.example.programmer_fox_club.models;

import java.util.*;
import java.util.stream.Collectors;


public class Fox {
    private String name;
    private List<Trick> tricks;
    private Food food;
    private Drink drink;



    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.drink = Drink.KOOL_AID;
        this.food = Food.CHICKEN;


    }

    public String getName() {
        return name;
    }


    public List<Trick> getTricks() {
        return tricks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTricks(List<Trick> tricks) {
        this.tricks = tricks;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
