import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer");
        int userInput1 = scanner.nextInt();
        System.out.println("Write second integer");
        int userInput2 = scanner.nextInt();
        System.out.println("Write third integer");
        int userInput3 = scanner.nextInt();
        System.out.println("Write fourth integer");
        int userInput4 = scanner.nextInt();
        System.out.println("Write fifth integer");
        int userInput5 = scanner.nextInt();
        int Sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        int Average = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;
        System.out.println("The sum of the numbers is: " + Sum);
        System.out.println("The average of the numbers is: " + Average);




    }
}
