import java.util.Arrays;
import java.util.List;

public class LambdaSum {
    //Write a Stream Expression to get the sum of the odd numbers in the following list:

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        double sum = numbers.stream().filter(num -> num % 2 != 0).reduce(0, Integer::sum);
        System.out.println(sum);

        double mySum = numbers.stream().filter(num -> num % 2 != 0).reduce(0, Sum::sum);

        System.out.println(mySum);
    }

    public static class Sum {
        public static int sum(int a, int b) {
            return a + b;
        }
    }
}
