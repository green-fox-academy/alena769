import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int userInput1 = scanner.nextInt();
        for ( int i = 1; i <= 10; i++){
            System.out.println(userInput1 * i);
        }
    }
}
