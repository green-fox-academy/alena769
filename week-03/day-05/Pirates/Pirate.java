package Pirates;

import java.util.Random;

public class Pirate {
    private String name;
    private int rumLevel;
    private boolean parrot;
    private boolean isAlive;

    public Pirate(String name, boolean parrot) {
        this.name = name;
        this.rumLevel = 0;
        this.parrot = parrot;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public int getRumLevel() {
        return rumLevel;
    }

    public boolean getParrot() {
        return parrot;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void drinkSomeRum() {
        if (this.isAlive) {
            this.rumLevel += 1;
        }
    }

    public void howsItGoingMate() {
        if (rumLevel < 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            rumLevel = 0;
        }
    }

    public void die() {
        if (this.isAlive == false) {
            System.out.println(this.name + " is dead.");
        }
    }

    public int getRandomNumber() {
        Random random = new Random();
        return new Random().nextInt(3);
    }

    @Override
    public String toString() {
        return name + " does he have a parrot: " + parrot + "\n";
    }

    public void brawl(Pirate pirate) {
        int randomNumber = getRandomNumber();

        if (this.isAlive && pirate.isAlive) {
            if (randomNumber == 0) {
                System.out.println("You both passed out!");
            } else if (randomNumber == 1) {
                System.out.println("You won! " + this.name);
                pirate.isAlive = false;
                pirate.die();
            } else {
                System.out.println("You won " + pirate.name);
                this.isAlive = false;
                this.die();
            }
        }
    }
}
