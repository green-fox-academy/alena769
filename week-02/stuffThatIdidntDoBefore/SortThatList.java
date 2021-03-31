import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortThatList {
    public static void main(String[] args) {
        int[] array = {34, 12, 24, 9, 5};
        System.out.println(sortList(array, true));
        System.out.println(sortList(array, false));
    }

    public static List<Integer> sortList(int[] array, boolean sorting) {
      List<Integer> list = new ArrayList<>();

        for (Integer integer : array) {
            list.add(integer);
        }
        if(sorting){
            Collections.sort(list);
        } else {
            Collections.sort(list, Collections.reverseOrder());
        }

        return list;
    }
}
