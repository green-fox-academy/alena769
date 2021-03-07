import java.util.Scanner;
public class OneTwoAlot {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write an integer:");
            int userInput1 = scanner.nextInt();
            if (userInput1 <= 0){
                System.out.println("Not Enough!");
            }
            else if (userInput1 == 1){
                System.out.println("One");
            }
            else if (userInput1 == 2){
                System.out.println("Two");
            }
            else{
                System.out.println("A Lot");
            }

    }
}
