package ToDoApp;

public class PrintUsage extends ToDoManipupation {


    @Override
    public void print() {
            System.out.println("Command Line Todo application" + "\n" + "=============================" + "\n"
                    + "Command line arguments:" + "\n" + "-l   Lists all the tasks" + "\n" + "-a   Adds a new task" + "\n" +
                    "-r   Removes an task" + "\n" + "-c   Completes an task");
    }

}
