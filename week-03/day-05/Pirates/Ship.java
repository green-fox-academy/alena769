package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    String name;
    List<Pirate> pirates;

    public Ship() {
        this.name = randomNameShip();
        System.out.println(this.name);
        this.pirates = new ArrayList<>();
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public int numberOfAlivePirates() {
        int counter = 0;

        for (Pirate crewCount : pirates) {
            if (crewCount.getIsAlive() == true) {
                counter++;
            }
        }
        return counter;
    }
    

    public List<Pirate> fillShip() {

        int randomNumber = getRandomNumber();
        Captain captain = new Captain(randomNamesCaptain(), false);
        if(randomNumber % 2 == 0){
        captain.drinkSomeRum();
        }else {
            for (int i = 0; i < randomNumber / 2; i++) {
                captain.drinkSomeRum();
            }
        }

        for (int i = 0; i < randomNumber - 1; i++) {
            pirates.add(new Pirate(randomNameGeneratorPirates(), false));
            pirates.toString();
        }
        pirates.add(captain);
        System.out.println(pirates);
        System.out.println("------------------------------");
        System.out.print("Captain " + name + "is alive: " + captain.getIsAlive());
        System.out.print(" Rum consumed: " + captain.getRumLevel() + "\n");
        System.out.println("Number of pirates alive: " + numberOfAlivePirates());

        return pirates;
    }


    public String randomNameGeneratorPirates() {
        List<String> listOfNamesPirates = new ArrayList<>();
        listOfNamesPirates.add("Pete Blackbeard");
        listOfNamesPirates.add("Misty Winters");
        listOfNamesPirates.add("Bill Bones");
        listOfNamesPirates.add("Voodoo Wendy");
        listOfNamesPirates.add("Peteplank");
        listOfNamesPirates.add("Salty Sarah");
        listOfNamesPirates.add("Black Bill The Feared");
        listOfNamesPirates.add("Shark-Fin Suzie");
        listOfNamesPirates.add("Wainwright ‘Bird Eye’ Shelley");
        listOfNamesPirates.add("Penelope Precious");
        listOfNamesPirates.add("John Blackeye");
        listOfNamesPirates.add("Sugar-Tongue Shelly");
        listOfNamesPirates.add("Poopdeck Pete");
        listOfNamesPirates.add("Silvera Snake-Eyes");
        listOfNamesPirates.add("Big Jones");
        listOfNamesPirates.add("Boney Brenda");
        listOfNamesPirates.add("Maximus Dark-Skull");
        listOfNamesPirates.add("One-Leg Nellie");
        listOfNamesPirates.add("Toothless Pete");
        listOfNamesPirates.add("One-Eye Wendy");
        listOfNamesPirates.add("Crimson Seadog");
        listOfNamesPirates.add("Lady Tide");
        listOfNamesPirates.add("Musclemouth Mike");
        listOfNamesPirates.add("Cut-Throat Connie");
        listOfNamesPirates.add("Winter Greybeard");
        listOfNamesPirates.add("Nancy Tall-Tide");
        listOfNamesPirates.add("Chipper Goldheart");
        listOfNamesPirates.add("Moonie Two-Toe");
        listOfNamesPirates.add("Thunder Dave");
        listOfNamesPirates.add("Esme Dark-Waters");
        listOfNamesPirates.add("Stinkin’ Pete");
        listOfNamesPirates.add("Jilly Buckets");
        listOfNamesPirates.add("Davey Dark-Skull");
        listOfNamesPirates.add("Mary Gun-Powder");
        listOfNamesPirates.add("Old-Tide Sammy");
        listOfNamesPirates.add("Liza Mcgee");
        listOfNamesPirates.add("Pistol-Grin Gary");
        listOfNamesPirates.add("Sadie Waters");
        listOfNamesPirates.add("Old Chipper");
        listOfNamesPirates.add("Joy McStubby");
        listOfNamesPirates.add("One-Tooth John");
        listOfNamesPirates.add("Betty Tuna-Breath");
        listOfNamesPirates.add("Hunter Brendan");
        listOfNamesPirates.add("Opal Sea-Wolf");
        listOfNamesPirates.add("Speechless Mike");
        listOfNamesPirates.add("Nancy Lobster-Legs");
        listOfNamesPirates.add("Mad Michael");
        listOfNamesPirates.add("Bella O’Greed");
        listOfNamesPirates.add("Handsome Jimmy");
        listOfNamesPirates.add("Ella Treasures");
        listOfNamesPirates.add("Rascal Jimmy");
        listOfNamesPirates.add("Ruth O’Patches");
        listOfNamesPirates.add("Cannonball Conner");
        listOfNamesPirates.add("Miranda Gold-Tooth");
        listOfNamesPirates.add("Jason Sea Legs");
        listOfNamesPirates.add("Vera Sparrow");
        listOfNamesPirates.add("Barnacle Bill");
        listOfNamesPirates.add("Carrie Atlantis");
        listOfNamesPirates.add("Silver-Tooth Samuel");
        listOfNamesPirates.add("Mazie Deep-Waters");
        listOfNamesPirates.add("Pete Peg-Leg");
        listOfNamesPirates.add("Peggy One-Leg");
        listOfNamesPirates.add("Lazy-Eye Louie");
        listOfNamesPirates.add("Evie Shark-Bait");
        listOfNamesPirates.add("Paddy Sparrow");
        listOfNamesPirates.add("Lou-Lou Stubbs");
        listOfNamesPirates.add("Vince Puffypants");
        listOfNamesPirates.add("Polly d’Plank");
        listOfNamesPirates.add("Jack Red-Locks");
        listOfNamesPirates.add("Pearl Bailey");
        listOfNamesPirates.add("Gordon Rough");
        listOfNamesPirates.add("Glory Jones");
        listOfNamesPirates.add("Oscar Foul");
        listOfNamesPirates.add("Clara Shadows");
        listOfNamesPirates.add("Wyatt Gold");
        listOfNamesPirates.add("Sally Black");
        listOfNamesPirates.add("Edwin ‘No Money’ Mables");
        listOfNamesPirates.add("Daisy O’Jelly");
        listOfNamesPirates.add("Theo Stinkalot");
        listOfNamesPirates.add("Suzie McGraw");
        listOfNamesPirates.add("George Balding");
        listOfNamesPirates.add("Janie Big-Lips");
        listOfNamesPirates.add("Hansel The Handsome");
        listOfNamesPirates.add("Vicky FishMonger");
        listOfNamesPirates.add("Jonas Rattler");
        listOfNamesPirates.add("Mabel Hook-Hand");
        listOfNamesPirates.add("Jacob Cutter");
        listOfNamesPirates.add("Mae Whiskey-Woo");
        listOfNamesPirates.add("Wade Wilds");
        listOfNamesPirates.add("Martha One-Eyed");
        listOfNamesPirates.add("Randell Rummy");
        listOfNamesPirates.add("Crazy Kellie");
        listOfNamesPirates.add("Garrick Roach");
        listOfNamesPirates.add("Lady Cassandra");
        listOfNamesPirates.add("Malvo Razor-Face");
        listOfNamesPirates.add("Lady Marilyn Man-Eater");
        listOfNamesPirates.add("Roger Starky");
        listOfNamesPirates.add("Mary Jane Death-Bringer");
        listOfNamesPirates.add("Finn O’Fish");
        listOfNamesPirates.add("Fulton 'Grimace' Beckwith");
        listOfNamesPirates.add("Dirty Danny");
        listOfNamesPirates.add("Dickinson 'Barnacle' Synth");
        listOfNamesPirates.add("Churchhill Evans");
        listOfNamesPirates.add("Denman 'Four-Eyes' Carlton");
        listOfNamesPirates.add("Celia ‘Butcher’ Tyde");
        listOfNamesPirates.add("Lauriston 'Double-Crossed' Snape");
        listOfNamesPirates.add("Elnora ‘Evil Grin’ Neale");
        listOfNamesPirates.add("Fallows 'Golden Teeth' Tyndall");
        listOfNamesPirates.add("Shiverin’ Shelley");
        listOfNamesPirates.add("Glover 'The Boar' Scias");
        listOfNamesPirates.add("Mighty Mary");
        listOfNamesPirates.add("Wellington 'Phantasm' Seth");
        listOfNamesPirates.add("Kellie Strong-Heart");
        listOfNamesPirates.add("Baker 'The Calm' Asema");
        listOfNamesPirates.add("True 'Subtle' Thorne");
        listOfNamesPirates.add("Abney Park");
        listOfNamesPirates.add("Barney Baxter");
        listOfNamesPirates.add("Sedgwick 'The Cook' Xix");
        listOfNamesPirates.add("Swabby McRattlebones");
        listOfNamesPirates.add("Pirate King Erik");
        listOfNamesPirates.add("Archer Diamond");
        listOfNamesPirates.add("Salty Swallow");
        listOfNamesPirates.add("Gungoose");
        listOfNamesPirates.add("Raggy Sandle Hook");
        listOfNamesPirates.add("Dead Tom");
        listOfNamesPirates.add("McPirateface");
        listOfNamesPirates.add("Admiral Taco");
        listOfNamesPirates.add("Curvy With Scurvy");
        listOfNamesPirates.add("Maxbeard the Cthulhian");
        listOfNamesPirates.add("Baron Kek");
        listOfNamesPirates.add("Dreadful");
        listOfNamesPirates.add("Seadog");
        listOfNamesPirates.add("Davey");
        listOfNamesPirates.add("Black Jack");
        listOfNamesPirates.add("Stati");
        Random randomName = new Random();

        return listOfNamesPirates.get(randomName.nextInt(listOfNamesPirates.size()));
    }

    public String randomNamesCaptain() {
        List<String> randomCaptainNames = new ArrayList<>();
        randomCaptainNames.add("Cap’n Dreadful");
        randomCaptainNames.add("Captain Justeene");
        randomCaptainNames.add("Captain Seadog");
        randomCaptainNames.add("Captain Mack Calabran");
        randomCaptainNames.add("Captain Vex Totem");
        randomCaptainNames.add("Captain Blackbeard");
        randomCaptainNames.add("Captain Silver-Tongue");
        randomCaptainNames.add("Captain Black Jack");
        randomCaptainNames.add("Admiral Storm");
        randomCaptainNames.add("Captain O’Fish");
        randomCaptainNames.add("Captain Cannon");
        randomCaptainNames.add("Captain Booty");
        randomCaptainNames.add("Captain David Death");
        randomCaptainNames.add("Captain Lazyjacks");
        randomCaptainNames.add("Cap’n Chipper Toes");
        randomCaptainNames.add("Captain Fish-Lips");
        Random random = new Random();
        return randomCaptainNames.get(random.nextInt(randomCaptainNames.size()));
    }

    public String randomNameShip() {
        List<String> namesOfShips = new ArrayList<>();
        namesOfShips.add("Abandoned Barnacle");
        namesOfShips.add("Angel of Doom");
        namesOfShips.add("Barbaric Serpent");
        namesOfShips.add("Black Pearl");
        namesOfShips.add("Bone Heart");
        namesOfShips.add("Bone Rattler");
        namesOfShips.add("Blood Lightening");
        namesOfShips.add("Old Scallywag");
        namesOfShips.add("Night Wind");
        namesOfShips.add("Blood-Thirsty Rover");
        namesOfShips.add("Old Sea Dog");
        namesOfShips.add("Revenge Queen");
        namesOfShips.add("Bloody Hangman");
        namesOfShips.add("Shadow Storm");
        namesOfShips.add("Shark Rider");
        namesOfShips.add("Sea of Terror");
        namesOfShips.add("Thunder Waves");
        namesOfShips.add("Vanilla Skyline");
        namesOfShips.add("Thunder Tide");
        namesOfShips.add("Sunken Seaweed");
        namesOfShips.add("Speedy Slug");
        Random r = new Random();
        return namesOfShips.get(r.nextInt(namesOfShips.size()));
    }


}

