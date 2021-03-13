import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteSingleLine {
    public static void main(String[] args) {
        appendLine("New Line", "src/WriteSingleLine.txt");


    }

        private static void appendLine(String lineToAppend, String file){
            try {
                Files.write(Paths.get(file),lineToAppend, StandardOpenOption.APPEND);

                System.out.println("Data successfully append to a file.");


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Cant append to a file name:");
            }
        }
}

