import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
and numbers as values that shows how many occurrences there are.
Create a test for that.
 */
public class CountLetters {
    String word;

    public CountLetters(String word) {
        this.word = word;
    }

    public HashMap<String, Integer> letterOccurrence() {
        HashMap<String, Integer> dictionary = new HashMap<>();

        String[] letters = word.split("");
        for (String character : letters) {
            if (dictionary.containsKey(character)) {
                dictionary.put(character, dictionary.get(character) + 1);
            } else {
                dictionary.put(character, 1);
            }
        }
        return dictionary;
    }
}
