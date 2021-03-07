import java.util.Scanner;
public class SubString {
    public static void main(String[] args){
        String s = "This is the sentence that I am searching in.";
        System.out.println("This is the sentence that I am searching in.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word you are searching for in the sentence:");
        String userInput1 = scanner.nextLine();
        int i = s.indexOf(userInput1);
        System.out.println(i);

    }
}
