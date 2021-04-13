package Exercise9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaFrequency {
    //Write a Stream Expression to find the frequency of characters in a given string!

    public static void main(String[] args) {
        String string = "Print frequencies of characters in a string using Java 8 features.";

//------------------ unsorted list ------------------------------------------------------

        Stream.of(string.toLowerCase().split(""))
                .collect(Collectors.groupingBy(letter -> letter, Collectors.counting()))
                .entrySet()
                .stream()
                .map(letter -> letter.getKey() + letter.getValue() + "")
                .forEach(System.out::println);
    }
}
