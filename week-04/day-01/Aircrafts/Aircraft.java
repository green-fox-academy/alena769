package Aircrafts;

public class Aircraft {
    int maxAmmo;
    int baseDamage;
    int ammunition;
    int damage;
    int totalDamage;
    String type;

    public Aircraft() {
        this.ammunition = 0;
    }

    public void fight(Aircraft aircraft) {
        aircraft.damage = this.baseDamage * this.ammunition;
        this.ammunition = 0;
        aircraft.totalDamage = aircraft.totalDamage + aircraft.damage;

        System.out.println(aircraft.totalDamage);
    }

    public int refill() {
        for (int i = 0; i < this.maxAmmo && this.ammunition < this.maxAmmo; i++) {
            this.ammunition++;
        }
        return this.ammunition;
    }

    public void getType() {
        System.out.println(this.type);
    }

    public void getStatus() {
        System.out.println("Type: " + this.type + ", Ammo: " + this.ammunition + ", Base Damage: " + this.baseDamage
                + ", All Damage: " + this.totalDamage);
    }

    public boolean isPriority() {
        if (this.type == "F35") {
            return true;
        }
        return false;
    }
}
