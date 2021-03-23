package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{

    public Violin() {
        super();
        name = "Violin";
        numberOfStrings = 4;
        soundOfInstrument = "Screech";
    }

    @Override
    public void sound() {

        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes "
                + this.soundOfInstrument);
    }
}
