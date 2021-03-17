package Animal;
/*
Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
When creating a new animal instance these values must be set to the default 50 value
Every animal can eat() which decreases its hunger by one
Every animal can drink() which decreases its thirst by one
Every animal can play() which increases both its hunger and thirst by one
 */

public class Animal {

    private int hunger;
    private int thirst;

    public Animal() {
        this(50, 50);

    }

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
        System.out.println("Hunger: " + hunger + "Thirst: " + thirst);
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void eat() {
        hunger -= 1;
    }

    public void drink() {
        thirst -= 1;
    }

    public void playing() {
        hunger += 1;
        thirst += 1;
    }

    public void displayEat() {
        System.out.println(hunger);
    }

    public void displayDrink() {
        System.out.println(thirst);
    }

}
