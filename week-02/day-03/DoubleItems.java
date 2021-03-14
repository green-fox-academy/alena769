// - Create an array variable named `numberList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
public class DoubleItems {
    public static void main(String[] args) {
        int[] numberList = {3, 4, 5, 6, 7};
        int length = numberList.length;
        for (int i = 0; i < length; i++) {
            numberList[i] = numberList[i] * 2;

        }

        for (int j:numberList) {
            String intoString = String.valueOf(j);
            System.out.println(intoString);

        }
    }
}
