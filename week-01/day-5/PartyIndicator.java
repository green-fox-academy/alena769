import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gils will come to the party?");
        int userInput1 = scanner.nextInt();
        System.out.println("How many boys will come to the party?");
        int userInput2 = scanner.nextInt();
        if ((userInput1 == userInput2) && ((userInput1 + userInput2) >= 20)){
            System.out.println("This party is Exelent!");
        }
        else if ((userInput1 != userInput2) && ((userInput1 + userInput2) > 20)){
            System.out.println("Quite cool party!");
        }
        else if ((userInput1 + userInput2) < 20){
            System.out.println("Average party ...");
        }
        else if (userInput1 == 0){
            System.out.println("Sausage party");
        }
    }
}
