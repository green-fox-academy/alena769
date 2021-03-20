import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed

public class Extension {
    private List<Integer> pool;

    public Extension() {
        this.pool = null;
    }


    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int maxOfThree(int a, int b, int c) {
        if (a != b && a != c && c != b) {
            if (a > b && a > c) {
                return a;
            }
            if (b > a && b > c) {
                return b;
            } else
                return c;
        }
        if (a == b && a != c) {
            if (b > c) {
                return b;
            } else return c;
        }
        return c;
    }

    public int median(int[] numbers) {
        this.pool = new ArrayList<>();
        for (int number : numbers) {
            pool.add(number);
        }

        return this.pool.get((pool.size() - 1) / 2);
    }

   public boolean isVowel(char c) {
       return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
   }

    public String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return teve;
    }
}

