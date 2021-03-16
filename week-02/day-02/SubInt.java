//  Create a function that takes a number and an array of integers as parameters
//  It returns the indices of the integers of the array which contain the given number
//  or returns an empty array (if the number is not part of any of the integers in the array)

//  Examples:
//  System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
//  should print: `[0, 1, 4]`
//  System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
//  should print: '[]'

// Note: We are using Arrays.toString() function to print the array returned
// You could just as well iterate over the array and print its items one by one

import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        int[] array = {3, 2, 56, 753, 65, 9, 354};
        System.out.println(findNumber(3, array));

    }

    /*public static ArrayList<Integer> findNumber(int number, int[] array) {
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String element = String.valueOf(array[i]);

            if(element.contains(String.valueOf(number))) {
                indices.add(i);
            }
        }
        return indices;
    }*/
    public static int[] findNumber(int number, int[] array) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            while ((array[i] / 10) > 0) {
                if (array[i] % 10 == number) {
                    indices.add(i);
                    break;
                }
                array[i] /= 10;
            }
        }
        int[] arr = new int[indices.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = indices.get(i);
        }
        return arr;
    }
}


