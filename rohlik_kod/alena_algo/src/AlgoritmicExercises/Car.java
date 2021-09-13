package AlgoritmicExercises;

import java.util.ArrayList;
import java.util.List;

/*
Your car is old, it breaks easily.
The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"),
 work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".
 */
public class Car {
    public static void main(String[] args) {
        String flatRoad = "n";
        String road = "______n___n_";
        String deadRoad = "nnnnnnnnnnnnnnnnnnnnn";
        String carDead = "_nnnnnnn_n__n______nn__nn_nnn";

        System.out.println(ride(deadRoad));
        System.out.println(ride(road));
        System.out.println(ride(flatRoad));
        System.out.println(ride(carDead));

    }


    public static String ride(String road) {
        int lives = 15;
        List<String> eachBump = new ArrayList<>();

        for (String el : road.split("")) {
            eachBump.add(el);
        }
            for (String bump : eachBump) {
                if (bump.equals("n") && lives > 0) {
                    lives--;
                }
            }

        if (lives <= 0) {

            return "Car Dead";
        } else {

            return "Woohoo!";
        }
    }
}
