import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) {
        String pathOne = "src/FileOne";
        String pathTwo = "src/FileTwo";
        System.out.println(writeLines(pathOne, pathTwo));

    }
    public static boolean writeLines(String pathOne, String pathTwo) {
        Path firstFile = (Paths.get(pathOne));
        Path secondFile = (Paths.get(pathTwo));

        try{
            List<String> firstList = Files.readAllLines(firstFile);
            List<String> secondList = Files.readAllLines(secondFile);
            secondList.addAll(firstList);
            Files.write(secondFile, secondList);

        }catch (IOException e){

            return false;
        }
        return true;
    }
}
