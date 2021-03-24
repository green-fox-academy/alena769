package com.greenfoxacademy.animals;

import java.util.Random;

public class Reptile extends LivingAnimal {

    public Reptile() {
        this.bloodType = "Coldblooded";
        this.kind = Kind.Reptile;
        this.maxAge = 5;
    }

    public int getRandomNumber() {
        Random random = new Random();
        return new Random().nextInt(10);
    }

    @Override
    public void breed() {
        int random = getRandomNumber();
        for (int i = 0; i < random; i++) {
            Reptile reptile = new Reptile();
        }
        if(random > 1){
            System.out.println("I laid: " + random + " eggs.");
        }else {
            System.out.println("I laid only one egg.");
        }

    }

    @Override
    public void eat() {
        this.hungerLevel -= 5;
        System.out.println("My hunger is:" + hungerLevel);
    }

    @Override
    public void living() {
        if (this.age < this.maxAge) {
            age++;
        } else {
            System.out.println("It's dead Jimmy!");
        }
    }

    @Override
    public void introduction() {
        System.out.println("I am a " + bloodType + " " + this.kind + " I am a " + this.age
                + " a years old, I live up to " + this.maxAge + " years.");
    }
}
