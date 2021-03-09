import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number:");
        int userInput1 = scanner.nextInt();
        int i = 6;
        while (userInput1 != i){
            if ( userInput1 > i){
                System.out.println("The number is higher!");
            }
            else{
                System.out.println("The number is smaller!");
            }
            System.out.println("Try again!");
            userInput1 = scanner.nextInt();
        }
        System.out.println("The number is correct!");


        }




    }



