package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        super();
        name = "Bass Guitar";
        numberOfStrings = 4;
        soundOfInstrument = "Duum-duum-duum";
    }
    public BassGuitar(int numberOfStrings) {
        super();
        this.numberOfStrings = numberOfStrings;
        name = "Bass Guitar";
        soundOfInstrument = "Duum-duum-duum";

    }
    @Override
    public void sound() {

        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes "
                + this.soundOfInstrument);
    }
}
