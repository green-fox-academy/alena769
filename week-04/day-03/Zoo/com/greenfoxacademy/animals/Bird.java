package com.greenfoxacademy.animals;

import java.util.Random;

public class Bird extends LivingAnimal {

    public Bird() {
        this.bloodType = "Warm-Blooded";
        this.kind = Kind.Bird;
        this.maxAge = 8;
    }

    public int getRandomNumber() {
        Random random = new Random();
        return new Random().nextInt(2);
    }

    @Override
    public void breed() {
        int random = getRandomNumber();
        for (int i = 0; i < random; i++) {
            Bird bird = new Bird();
        }
        if(random > 1){
            System.out.println("I laid: " + random + " eggs.");
        }else {
            System.out.println("I laid only one egg.");
        }
    }

    @Override
    public void eat() {
        this.hungerLevel -= 1;
        System.out.println("My hunger is:" + hungerLevel);

    }

    public void living() {
        if (this.age < this.maxAge) {
            age += 3;
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
