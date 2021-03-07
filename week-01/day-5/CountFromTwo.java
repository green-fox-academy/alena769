import java.util.Scanner;
public class CountFromTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int userInput1 = scanner.nextInt();
        System.out.println("Type a second number:");
        int userInput2 = scanner.nextInt();
        if(userInput1 <= userInput2){
            while (userInput1 < userInput2){
                System.out.println(userInput1);
                userInput1+=1;
            }
        }
    }
}
