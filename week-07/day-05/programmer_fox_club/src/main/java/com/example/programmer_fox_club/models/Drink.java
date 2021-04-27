package com.example.programmer_fox_club.models;

public enum Drink {
    MILK(" Banana milk shake"),
    KOOL_AID("Kool-Aid"),
    LEMONADE("Kofola");


    public final String label;

    Drink(String label) {
        this.label = label;
    }
}
