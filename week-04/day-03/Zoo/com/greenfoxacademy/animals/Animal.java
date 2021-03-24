package com.greenfoxacademy.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int maxAge;
    protected Kind kind;
    protected int hungerLevel;
    protected String bloodType;


    public Animal() {
        this.age = 1;
        this.hungerLevel = 20;
    }

    public String getName() {
        return name;
    }

    public abstract void lifeCycle();
}

