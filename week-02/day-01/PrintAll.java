// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`

import java.util.Arrays;

public class PrintAll {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        String stringArray = Arrays.toString(numbers);
        System.out.println(stringArray);
    }
}