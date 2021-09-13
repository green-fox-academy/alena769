import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSqPositive {

    //Write a Stream Expression to get the squared value of the positive numbers from the following list:

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> squaredPositive = numbers.stream().filter(number -> number>0)
                .map(number -> number*number).collect(Collectors.toList());
    }
}
