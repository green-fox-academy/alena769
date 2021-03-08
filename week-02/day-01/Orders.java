// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Orders {
    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>(Arrays.asList("first", "second", "third"));
        Collections.swap(orders, 0, 2);
        System.out.println(orders);

    }
}
