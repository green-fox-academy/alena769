package ToDoApp;

import java.io.File;

public class PrintAllTasks extends ToDoManipupation {


    public void printAllTasks() {
       File file = new File(fileName);
        if (file.length() == 0) {
            System.out.println("No todos for today! :)");
        }
        int numberOfLines = 0;
        for (String task : readFile()) {
            System.out.println(numberOfLines + " - " + "[ ]" + task);
            numberOfLines++;
            if (task.equals("Buy milk")) {
                System.out.println(numberOfLines + " - " + "[X]" + task);
            }
        }
    }
}


