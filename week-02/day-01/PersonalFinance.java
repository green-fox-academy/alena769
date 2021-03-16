/*
We are going to represent our expenses in a list containing integers.

Create a list with the following items.
500, 1000, 1250, 175, 800 and 120
Create an application which solves the following problems.
How much did we spend?
Which was our greatest expense?
Which was our cheapest spending?
What was the average amount of our spendings?
 */

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        int[] spent = {120, 500, 1000, 1250, 175, 800};
        System.out.println(lovestSpending(spent));
        System.out.println(highestSpending(spent));
        System.out.println(awerageSpending(spent));
    }
    public static int lovestSpending(int[] spent) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < spent.length; i++) {
            list.add(spent[i]);
        }
        Collections.sort(list);
        return list.get(0);
    }
    public static int highestSpending(int[] spent) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < spent.length; i++) {
            list.add(spent[i]);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    public static int awerageSpending(int[] spent) {
        int sum = 0;
        for (int i = 0; i < spent.length; i++) {
            sum = sum + spent[i];
        }
        return sum / spent.length;
    }
}

