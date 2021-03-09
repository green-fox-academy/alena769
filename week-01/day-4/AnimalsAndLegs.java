import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int userInput1 = scanner.nextInt();
        System.out.println("How many pigs do you have?");
        int userInput2 = scanner.nextInt();
        System.out.println((userInput1 * 2) + (userInput2 * 4));
    }
}
