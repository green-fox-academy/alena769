import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        String string = "abcde";
        String string1 = "abcdef";
        int i = 3;
        char ch = '_';

        System.out.println(Arrays.toString(cutter(string)));
//        System.out.println(addChar(string, ch, i));
    }

    public static String[] cutter(String s) {
        if(s.length() %2 == 0) {
            return s.toLowerCase().split("(?<=\\G.{2})");
        }else {
           String lastChar = s.substring(s.length() -1);
           String rest = s.substring(0, s.length() -1);
           StringBuilder sb = new StringBuilder();
           StringBuilder newCharArray = sb.append(lastChar).append("_");
           String newString = rest + newCharArray;

            return newString.split("(?<=\\G.{2})");
        }
    }

    public static String addChar(String str, char ch, int position) {
        int len = str.length();
        char[] updatedArr = new char[len + 1];
        str.getChars(0, position, updatedArr, 0);
        updatedArr[position] = ch;
        str.getChars(position, len, updatedArr, position - 1);
        return new String(updatedArr);
    }
}
