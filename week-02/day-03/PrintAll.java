// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`

public class PrintAll {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        for (int j: numbers) {
            String numbersToString = String.valueOf(j);
            System.out.print(numbersToString);
        }
    }
}
