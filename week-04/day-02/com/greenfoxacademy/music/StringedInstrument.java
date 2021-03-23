package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;
    protected String soundOfInstrument;

    public StringedInstrument() {
    }

    @Override
    public void play() {
        sound();
    }

    public abstract void sound();
}
