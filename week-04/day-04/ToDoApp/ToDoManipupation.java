package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToDoManipupation extends Task{
    protected String fileName;

    public ToDoManipupation() {
        super();
        this.fileName = "src/ToDoApp/ToDo.txt";

    }
    public List<String> readFile() {
        Path path = Paths.get(fileName);
        try {
           return Files.readAllLines(path);
        }catch (IOException e){
            System.out.println("File: " + this.fileName + " not found.");
        }
        return null;
    }

    public void addNewTask() {
    }

    public void print() {

    }
    public void printAllTasks() {}
    public void removeTask() {}
}
