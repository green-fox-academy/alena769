import ToDoApp.AddNewTask;
import ToDoApp.ArgumentHandler;

public class Main {
    public static void main(String[] args) {
        AddNewTask newTask = new AddNewTask();
       // newTask.addNewTask("Walk the dog" + "\n");
       // newTask.addNewTask("Buy milk" + "\n");
       //newTask.addNewTask("Do Homework");
       // newTask.addNewTask("");
        ArgumentHandler.handleArgument(args);
        //RemoveTask removeTask = new RemoveTask();
        newTask.printAllTasks();


    }
}
