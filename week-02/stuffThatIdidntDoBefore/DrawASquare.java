public class DrawASquare {
    public static void main(String[] args) {
        printSquare(6,6);
    }

    public static void printSquare(int numberOfRows, int numberOfColumns) {

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfColumns; j++) {

                if (i == 1 || i == numberOfRows || j == 1 || j == numberOfColumns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
