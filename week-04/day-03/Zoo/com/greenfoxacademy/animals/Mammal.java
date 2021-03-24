package com.greenfoxacademy.animals;

import java.util.Random;

public class Mammal extends LivingAnimal {

    public Mammal() {
        this.bloodType = "Warm-Blooded";
        this.kind = Kind.Mammal;
        this.maxAge = 10;
    }

    public int getRandomNumber() {
        Random random = new Random();
        return new Random().nextInt(5);
    }

    @Override
    public void breed() {
        int random = getRandomNumber();
        for (int i = 0; i < random; i++) {
            Mammal mammal = new Mammal();
        }
        if(random > 1){
            System.out.println("I gave birth to: " + random + " offsprings.");
        }else {
            System.out.println("I gave birth to only one offspring.");
        }
    }

    @Override
    public void eat() {
        this.hungerLevel -= 10;
        System.out.println("My hunger is:" + hungerLevel);
    }

    @Override
    public void living() {
        if (this.age < this.maxAge) {
            age += 2;
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
