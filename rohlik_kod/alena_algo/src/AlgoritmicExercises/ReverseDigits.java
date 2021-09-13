package AlgoritmicExercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseDigits {
    public static void main(String[] args) {
        int number = -456;
        int positive = 123;
        int zero = 1000;
        System.out.println(reverseDigits(number));
        System.out.println(reverseDigits(positive));
        System.out.println(reverseDigits(zero));
    }

    public static int reverse(int number) {
        int sign = 1;
        if (number < 0) {
            sign = -1;
            number *= -1;
        }

        StringBuilder sb = new StringBuilder();

        Stream.of(String.valueOf(number).split("")).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).forEach(sb::append);

        return sign * Integer.parseInt(sb.toString());

    }

    public static String reverseDigits(int number) {
        String stringNumber = Integer.toString(number);
        List<String> listOfDigits = new ArrayList<>();
        List<String> reverseOrder = new ArrayList<>();
        String reversedString = new String();

        for (String digit : stringNumber.split("")) {
            if (!digit.equals("0")) {
                listOfDigits.add(digit);
            } else {
                break;
            }
        }

        for (int i = listOfDigits.size() - 1; i >= 0; i--) {
            reverseOrder.add(listOfDigits.get(i));
        }

        if (number < 0) {
            for (int i = 0; i < reverseOrder.size() - 1; i++) {
                reversedString = reversedString.concat(reverseOrder.get(i));
            }

            return "-" + reversedString;
        } else {
            for (int i = 0; i < reverseOrder.size(); i++) {
                reversedString = reversedString.concat(reverseOrder.get(i));
            }
        }

        return reversedString;
    }
}
