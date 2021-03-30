import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DeleteTheComments {
    public static void main(String[] args) {
        String fileName = "src/DeleteTheComents.txt";
        removeComments(fileName);
    }

    public static void write(String fileName, ArrayList array) {
        try {
            Files.write(Paths.get(fileName),array);
        }catch (IOException e) {
            System.out.println("Cant save changes to file");
        }
    }

    public static int removeComments(String fileName) {
       ArrayList<String> arrayList = makingArray(fileName);
       ArrayList<String> arrayReplaced = new ArrayList<>();
       int counter = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            String line = arrayList.get(i);
            if(line.contains("//")) {
                arrayReplaced.add(line.replaceAll("//", ""));
                counter++;
            }else {
                arrayReplaced.add(line);
            }
        }
        write(fileName, arrayReplaced);
        System.out.println(counter);
        return counter;
    }

    public static ArrayList<String> makingArray(String fileName) {
        List<String> lines = readFile(fileName);
        List<String> array = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            array.add(lines.get(i));
        }
        return (ArrayList<String>) array;
    }

    public static List<String> readFile(String fileName) {
        Path path = Paths.get(fileName);
        try{
            return Files.readAllLines(path);
        }catch (IOException e) {
            System.out.println("Cant read the file");
        }
        return null;
    }
}
