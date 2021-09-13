import java.util.Arrays;

public class TwoToOne {
    public static void main(String[] args) {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";

        System.out.println(newString(a, b));
    }

    public static String newString(String s1, String s2) {
        String collected = s1 + s2;
        String[] char1 = collected.split("");
        String without = "";
        StringBuilder sb = new StringBuilder();

        for (String ch : char1) {
            if (without.contains(ch)) {
                without = without;
            } else {
                without = sb.append(ch).toString();
            }
        }
        char[] chars = without.toCharArray();
        Arrays.sort(chars);

        return String.valueOf(chars);
    }

}
