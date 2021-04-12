import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Stream Expression to get the even numbers from the following list:
public class LambdaEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        // getting squared because I read wrong line in exercise ...

        numbers.stream().map(number -> number * number).forEach(System.out::println);
        List<Integer> squared = numbers.stream().map(number -> number * number).collect(Collectors.toList());

        // now the correct one

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

    }
}
