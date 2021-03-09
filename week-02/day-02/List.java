import java.util.ArrayList;

/*
Create an empty list which will contain names (strings)
Print out the number of elements in the list
Add William to the list
Print out whether the list is empty or not
Add John to the list
Add Amanda to the list
Print out the number of elements in the list
Print out the 3rd element
Iterate through the list and print out each name
William
John
Amanda
Iterate through the list and print
1. William
2. John
3. Amanda
Remove the 2nd element
Iterate through the list in a reversed order and print out each name
Amanda
William
Remove all elements
*/
public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.add("William");


        // testing if the array is empty ---------------------------

        boolean emptyOrNot = names.isEmpty();
        if (emptyOrNot == true) {
            System.out.println("This is empty Array");
        } else {
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }
        }

        names.add("John");
        names.add("Amanda");
        int lengthOfArray = names.size();
        System.out.println(lengthOfArray);

        System.out.println(names.get(2));

        int counter = 1;
        for (String elementOfList: names) {
            System.out.println(counter + "." + elementOfList);
            counter++;
        }
        names.removeAll(names);
        System.out.println(names);
    }
}

