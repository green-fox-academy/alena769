import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer:");
        int userInput1 = scanner.nextInt();
        if (userInput1 % 2 == 0){
            System.out.println("This is even number.");
        }
        else{
            System.out.println("This is an odd number");
        }
    }
}
