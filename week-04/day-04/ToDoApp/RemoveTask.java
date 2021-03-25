package ToDoApp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask extends ToDoManipupation{

    public void removeTask(String argument) {
        try{
            File file = new File(fileName);
            int argumentInt = Integer.parseInt(argument);
            if(file.length() != 0) {
                List<String> allLines = readFile();
                allLines.remove(argumentInt);
                try {
                    Files.write(Paths.get(fileName),allLines);
                }catch (IOException e){
                    System.err.println("Unable to write to the file");
                }
            }else if(file.length() > argumentInt){
                System.out.println("Unable to remove: index is out of bound");
            }
        }catch (NumberFormatException nfe){
            System.out.println("Unable to remove: index is not a number");
        }
    }
}
