import java.util.Scanner;
public class pyramidaObracene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int userInput1 = scanner.nextInt();

        for(int i = userInput1; i >= 1; --i) {
            for(int space = 1; space <= userInput1 - i; ++space) {
                System.out.print("  ");
            }
            int j=0;

            if (j % i == 0){
                System.out.print("* ");
            }

            System.out.println();


        }

    }
}