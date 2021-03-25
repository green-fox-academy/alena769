package ToDoApp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AddNewTask extends ToDoManipupation {
    String newTask;

    public AddNewTask() {
        super();
        this.newTask = newTask;
    }

    public void addNewTask(String newTask) {
        /// empty new task
        if(newTask == ""){
            System.out.println("Unable to add: no task provided");
        }
        /// appending a line
        try {
            String lineBreaker = newTask + "\n";
            Files.write(Paths.get(fileName), lineBreaker.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        }catch (IOException e) {
            System.out.println("Cant append task.");
        }
    }
}
