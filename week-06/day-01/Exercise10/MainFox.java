package Exercise10;

import java.util.*;
import java.util.stream.Collectors;

public class MainFox {
    public static void main(String[] args) {
        Fox fox = new Fox("Hellen", "red", 3);
        Fox fox1 = new Fox("Filip", "green", 10);
        Fox fox2 = new Fox("Hans", "green", 4);
        Fox fox3 = new Fox("Chris", "blue", 2);
        Fox fox4 = new Fox("Olga", "yellow", 3);
        Fox fox5 = new Fox("Jen", "orange", 4);
        Fox fox6 = new Fox("It", "green", 4);

        List<Fox> foxList = new ArrayList<>();
        foxList.add(fox);
        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
        foxList.add(fox4);
        foxList.add(fox5);
        foxList.add(fox6);
// --- green foxes -------------
        List<Fox> greenFoxes = foxList.stream()
                .filter(greenFox -> greenFox.getColor().equals("green"))
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(greenFoxes.toArray()));

// ------- green foxes older younger than 5 ------------------

        List<Fox> greenYoungFoxes = foxList.stream()
                .filter(greenFox -> greenFox.getColor().equals("green") && greenFox.getAge() < 5)
                .collect(Collectors.toList());

// ------- frequency by color ---------------------------

        foxList.stream()
                .collect(Collectors.groupingBy(Fox::getColor, HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((a,b) -> b.compareTo(a)))
                .map(foxes -> foxes.getKey() +" "+ foxes.getValue())
                .forEach(System.out::println);
    }
}
