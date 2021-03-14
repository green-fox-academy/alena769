// - Create a two dimensional array dynamically with the following content.
//   Note that a two dimensional array is often called matrix if every
//   internal array has the same length.
//   Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
//   Its length should depend on a variable
//
// - Print this two dimensional array to the output

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalMatrix {
    public static void main(String[] args) {
        List<int[]> values = new ArrayList<int[]>();
        values.add(new int[] {1,0,0,0});
        values.add(new int[] {0,1,0,0});
        values.add(new int[] {0,0,1,0});
        values.add(new int[] {0,0,0,1});
        for (int[] eachRow: values) {
            System.out.println(Arrays.toString(eachRow));
        }

    }
}
