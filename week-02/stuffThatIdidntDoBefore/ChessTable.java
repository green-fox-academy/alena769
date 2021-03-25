import java.util.ArrayList;
import java.util.List;

public class ChessTable {
    public static void main(String[] args) {
        draw(8);

    }

    public static List<String> intToArray(int numberOfLines) {
        List<String> listOfStrings = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            listOfStrings.add(String.valueOf(i));
        }
        return listOfStrings;
    }

    public static void draw(int lines) {
        List<String> list = intToArray(lines);
        List<Integer> intList = new ArrayList<>();

        for (String s : list) {
            intList.add(Integer.valueOf(s));
        }
        for (Integer i : intList) {
            if (i % 2 == 0) {
                System.out.println("% % % %");
            } else {
                System.out.println(" % % % %");
            }
        }
    }
}

