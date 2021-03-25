package ToDoApp;

public class ArgumentHandler extends ToDoManipupation{

    public static void handleArgument(String[] args) {

        if (args[0].equals("-l")) {
            ToDoManipupation l = new ToDoManipupation();
            l.printAllTasks();

        } else if (args[0].equals("-a")) {
            AddNewTask taskAddor = new AddNewTask();
            String newTaks = args[1];
            taskAddor.addNewTask(newTaks);

        } else if (args[0].equals("-r")) {
            RemoveTask taskRemover = new RemoveTask();
            String argument = args[1];
            taskRemover.removeTask(argument);

        }else if (args[0].equals("-c")){


        }
    }
}
