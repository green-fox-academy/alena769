package Exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Random {
    public static void main(String[] args) {
        List<String> fileLines = readFile();

         fileLines.parallelStream()
                .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((a,b) -> b.compareTo(a)))
                .map(word -> word.getKey() + word.getValue() + " ")
                .forEach(System.out::println);
    }

    public static List<String> readFile() {
        Path path = Paths.get("src/Exercise11/Random.txt");
        try {

            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Cant read the file");
        }

        return null;
    }
}
