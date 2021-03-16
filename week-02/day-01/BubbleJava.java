//  Create a function that takes an array of numbers as parameter
//  and returns an array where the elements are sorted in ascending numerical order
//  When you are done, add a second boolean parameter to the function
//  If it is `true` sort the array descending, otherwise ascending

/*  Example:
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
            //  should print [5, 9, 12, 24, 34]
            System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
            //  should print [34, 24, 12, 9, 5]
            }*/
import java.util.*;
public class BubbleJava {
    public static void main(String[] args) {
        int[] list = {1, 5, 6, 8, 65, 857, 0, 2};
        System.out.println(sortNumbers(list));
    }
   /* public static ArrayList<Integer> sortNumbersAscending(int[] list) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            integerArrayList.add(list[i]);
        }
        Collections.sort(integerArrayList);
        return integerArrayList;
        }*/
    public static ArrayList<Integer> sortNumbers(int[] list) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            integerArrayList.add(list[i]);
        }
        Collections.sort(integerArrayList,Collections.reverseOrder());
        return integerArrayList;
    }
}


