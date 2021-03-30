public class AntiDiagonal {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {3, 4, 6},
                {5, 2, 5}};

        int[][] array2 = {{3, 5, 11, -2},
                {3, 1, 7, 4},
                {5, 0, 2, 9},
                {21, 7, 8, 2}};
        System.out.println(getAntiDiagonal(array2));

    }

    public static double getAntiDiagonal(int[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == array.length - 1 && j == i + 1) {
                    sum +=  array[i][j];
                } else if (i == 0 && j == array.length - 1) {
                    sum +=  array[i][j];
                } else if (i == array.length - 1 && j == 0) {
                    sum +=  array[i][j];
                } else if (i == array.length - 1 && j == i - 1) {
                    sum +=  array[i][j];
                }
            }
        }
        return sum / array.length;
    }
}
