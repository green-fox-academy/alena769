package com.greenfoxacademy.animals;

public abstract class LivingAnimal extends Animal{


    public abstract void breed();

    public abstract void eat();

    public abstract void living();

    public abstract void introduction();

    @Override
    public void lifeCycle() {
        introduction();
        breed();
        eat();
        living();
    }
}
