package com.example.programmer_fox_club.models;

public enum Food {
    RAT("One rat with ketchup"),
    CHICKEN("Southern fried chicken with some Texas Champagne"),
    SHRIMP("Put Another Shrimp On The Barbie"),
    EGG("One over easy egg");

    public final String label;
    Food(String label) {
        this.label = label;
    }
}
