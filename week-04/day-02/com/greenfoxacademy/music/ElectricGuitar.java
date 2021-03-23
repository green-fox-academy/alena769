package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super();
        name = "Electric Guitar";
        numberOfStrings = 6;
        soundOfInstrument = "Twang";
    }

    @Override
    public void sound() {

        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes "
                + this.soundOfInstrument);
    }

    public ElectricGuitar(int numberOfStrings) {
        super();
        this.numberOfStrings = numberOfStrings;
        name = "Electric Guitar";
        soundOfInstrument = "Twang";
    }

}
