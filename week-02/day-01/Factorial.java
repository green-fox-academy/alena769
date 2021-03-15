//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Writhe an integer");
        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();
        System.out.println(calculateFactorial(userInput));
    }
    public static Integer calculateFactorial(Integer userInput) {
        Integer factorial = userInput;
        for (int i = 0; i < userInput; i++) {
            factorial = (userInput -1) * userInput;
        }
        return factorial;
    }

}
