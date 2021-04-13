package Exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate {
    //Write a Stream Expression to concatenate a Character list to a string!
    public static void main(String[] args) {
        List<String> characterList = Arrays.asList("H", "e", "l", "l", "o");

      String word = characterList.stream().collect(Collectors.joining());
        System.out.println(word);

    }
}
