package Aircrafts;

import java.util.ArrayList;
import java.util.List;

public class Carrier extends Aircraft {
    List<Aircraft> aircrafts;
    int storedAmmo;
    int usedAmmo;
    int carrierDamage;
    int hp;


    public Carrier() {
        this.aircrafts = new ArrayList<>();
        this.storedAmmo = 200;
        this.hp = 5000;
        this.usedAmmo = 0;
        this.carrierDamage = 0;
    }

    public void add(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }
    public void printCarrier() {
        for (Aircraft aircraft: aircrafts) {
            System.out.println(aircraft);
        }
    }

    public void refillCarrier() {
        if (this.usedAmmo < storedAmmo) {
            for (Aircraft aircraft : aircrafts) {
                aircraft.refill();
                this.usedAmmo = this.usedAmmo + aircraft.ammunition;
            }
        }
        System.out.println("used amo " + this.usedAmmo);
    }
    public int fightCarrier(Carrier carrier) {
        for (Aircraft aircraft: aircrafts) {
            carrier.carrierDamage = aircraft.baseDamage * aircraft.ammunition;
        }
        return carrierDamage;
    }

    public void getStatusCarrier() {
        if(this.hp > 0) {
            System.out.println("HP: " + (this.hp - this.carrierDamage) + ", Aircraft count: " + this.aircrafts.size()
                    + ", Ammo Storage:" + (this.storedAmmo - this.usedAmmo) + ", Total damage: " + carrierDamage);
            for (Aircraft aircraft : aircrafts) {
                System.out.println("Type: " + aircraft.type + ", Ammo: " + aircraft.ammunition + ", Base Damage: "
                        + aircraft.baseDamage + ", All Damage: " + (aircraft.baseDamage * aircraft.ammunition));
            }
        }else {
            System.out.println("It's dead Jim :( ");
        }
    }
}

