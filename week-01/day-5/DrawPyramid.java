import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int userInput1 = scanner.nextInt();
        int k = 0;

        for (int i = 1; i <= userInput1; ++i, k = 0) {
            for (int space = 1; space <= userInput1 - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

    }
}
