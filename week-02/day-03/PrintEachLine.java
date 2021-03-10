// Write a program that opens a file called "my-file.txt" and prints each
// line from the file.
// If the program is unable to read the file (for example the file does not exist),
// it should print the following error message: "Unable to read file: my-file.txt".

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {
        System.out.println("What file do you want to open?");
        String filename = new Scanner(System.in).nextLine();
        Path path = Paths.get("src/" + filename + ".txt");

        System.out.println("File" + readFile(path) + " is opened.");
    }


    public static List<String> readFile(Path path) {
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The file does not exist.");
        }

        System.out.println("File opened");
        return lines;
    }
}
