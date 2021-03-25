import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapOrder {
    // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
    public static void main(String[] args) {
        String[] strings = {"first", "second", "third"};
        List<String> stringArray = new ArrayList<String>(Arrays.asList(strings));
        Collections.swap(stringArray, 0,2);
        System.out.println(stringArray);
    }
}
