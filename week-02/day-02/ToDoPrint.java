// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText applying indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

import java.util.ArrayList;

public class ToDoPrint {
    public static void main(String[] args) {
        ArrayList<String> finalToDo = new ArrayList<>();
        finalToDo.add("My todo:");
        finalToDo.add("- Buy milk");
        finalToDo.add("- Download games");
        finalToDo.add("   - Diablo");

        for (String element : finalToDo) {
            System.out.println(element);

        }

    }

}
