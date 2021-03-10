// Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0

import java.text.DecimalFormat;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Type an integer: ");
        double userInput = new Scanner(System.in).nextDouble();
        DecimalFormat df = new DecimalFormat("##.##");


        System.out.println(df.format(numberDivision(userInput)));
    }

    public static double numberDivision(double userInput) {
        double number = 10;
        double divisionResult = 0;

        try {
            divisionResult = number / userInput;

        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero.");

        }
        return divisionResult;
    }
}
