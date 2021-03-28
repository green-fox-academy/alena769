public class DrawDiagonal {
    /*
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
     */
    public static void main(String[] args) {
        printSquare(6);
    }

    public static void printSquare(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfRows; j++) {
                if (i == 1 || i == numberOfRows || j == 1 || j == numberOfRows || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

