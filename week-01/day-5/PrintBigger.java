import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        double userInput1 = scanner.nextDouble();
        System.out.println("Write another number:");
        double userInput2 = scanner.nextDouble();
        if (userInput1 > userInput2){
            System.out.println(userInput1);
        }
        else {
            System.out.println(userInput2);
        }



    }
}
