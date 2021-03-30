import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntiDiagonalTest {

    @Test
    void getAntiDiagonal() {

        int[][] array = {{1, 2, 3},
                         {3, 4, 6},
                          {5, 2, 5}};

        assertEquals(4, AntiDiagonal.getAntiDiagonal(array));

    }
    @Test
    void getAntiDiagonal() {
        int[][] array2 = {{3, 5, 11, -2},
                {3, 1, 7, 4},
                {5, 0, 2, 9},
                {21, 7, 8, 2}};

        assertEquals(6.5,AntiDiagonal.getAntiDiagonal(array2));


    }





}