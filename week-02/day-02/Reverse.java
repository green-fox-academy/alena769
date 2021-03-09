import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Create a method that can reverse a String which is passed as parameter
// Pass the toBeReversed variable to this method to check if it works well
// Solve this task using charAt() function first
// Try other solutions when you are done
public class Reverse {
   /* public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(toBeReversed);
        reverseString.reverse();
        System.out.println(reverseString);
    } */

    /* charAt method
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String reversedString = "";
        for (int i = toBeReversed.length() - 1; i >= 0; i--) {
            reversedString = reversedString + toBeReversed.charAt(i);
        }
        System.out.println(reversedString);
    }
    */
/* Byte method
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        byte[] stringByteArray = toBeReversed.getBytes();
        byte[] reverseStringByteArray = new byte[stringByteArray.length];
        String reversedString;

        for (int i = 0; i < stringByteArray.length -1; i++) {
            reverseStringByteArray[i] = stringByteArray[stringByteArray.length -i -1];
        }
        reversedString = new String(reverseStringByteArray);
        System.out.println(reversedString);
    }*/

    public static void main(String[] args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        char[] stringArray = toBeReversed.toCharArray();
        List<Character> arrayList = new ArrayList<>();
        String reversedString = "";
        for (char character: stringArray) {
            arrayList.add(character);
        }
        Collections.reverse(arrayList);
        for (Character character: arrayList) {
            reversedString = reversedString + character;
        }
        System.out.println(reversedString);
    }


}
