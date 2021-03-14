// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element

public class IncrementElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
            arr[2] = arr[2] + 1;
            String intToString = String.valueOf(arr[2]);
            System.out.print(intToString);
    }
}

