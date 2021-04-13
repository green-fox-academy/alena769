package Exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindString {
    //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String letter = "R";

        cities.stream().filter(city -> city.startsWith(letter)).forEach(System.out::println);
        List<String> cityList = cities.stream().filter(city -> city.startsWith(letter)).collect(Collectors.toList());


    }
}
