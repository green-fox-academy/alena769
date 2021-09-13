package AlgoritmicExercises;

/*
An ordered sequence of numbers from 1 to N is given. One number might have deleted from it,
 then the remaining numbers were mixed. Find the number that was deleted.
 */
public class LostNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] missing = {3, 2, 4, 6, 7, 8, 1, 9};

        System.out.println(missingNumber(array, missing));
    }

    public static int missingNumber(int[] array, int[] missing) {
        int sum = 0;
        int sumMissing = 0;

        for (Integer number : array) {
            sum = number + sum;
        }
        for (Integer numberM : missing) {
            sumMissing = numberM + sumMissing;
        }

        return sum - sumMissing;
    }
}
