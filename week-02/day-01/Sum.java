// Create the usual class wrapper and main method on your own

import java.util.Scanner;

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
public class Sum {
    public static void main(String[] args) {
        System.out.println("Write an integer");
        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();
        System.out.println(sumFunction(userInput));
    }
    public static Integer sumFunction(Integer userInput) {
        if (userInput <= 1) {
            return userInput;
        }
        return sumFunction(userInput - 1) + userInput;
    }
}
