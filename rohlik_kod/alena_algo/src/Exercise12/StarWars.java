package Exercise12;
/*
Create Stream expressions to perform the following exercises:

Print the name of the heaviest character (if the mass is unknown, ignore that character)
Print the average height of the male characters
Print the average height of the female characters
💪 Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
The result should be a Map<String, Map<String, Integer>>
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StarWars {
    public static void main(String[] args) {
        List<String> fileLines = readTheFile();

        fileLines
                .stream().skip(1)
                .map(line -> Arrays.stream(line.split(";")).collect(Collectors.toList()).stream());
    }

    public static List<String> readTheFile() {
        Path path = Paths.get("src/Exercise12/starWars.csv");
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Cant read the file");
        }

        return null;
    }
}
