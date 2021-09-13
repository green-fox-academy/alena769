package AlgoritmicExercises;

import java.util.Arrays;

/*
In this Kata, you will be given an array of integers whose elements have both a negative and a positive value,
 except for one integer that is either only negative or only positive. Your task will be to find that integer.
 */
public class ElementArray {
    public static void main(String[] args) {
        int[] array = {1, -1, 2, -2, 3};
        System.out.println(findPairLess(array));

    }
    public static int findPairLess(int[] array) {
        return Arrays.stream(array).distinct().sum();
    }
}
