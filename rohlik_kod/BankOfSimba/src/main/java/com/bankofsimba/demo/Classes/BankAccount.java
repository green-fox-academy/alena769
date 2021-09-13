package com.bankofsimba.demo.Classes;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private Boolean isKing;

    public BankAccount(String name, double balance, String animalType, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setKing(boolean isKing) {
       this.isKing = isKing;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean getKing() {
        return isKing;
    }
}
