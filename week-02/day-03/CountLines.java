import java.util.Scanner;

// Write a function that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
public class CountLines {
    public static void main(String[] args) {
        System.out.println("What file do you want to open?");
        String userInput = new Scanner(System.in).nextLine();
        String filename ="src/" + userInput + ".txt";
        System.out.println(countLines(filename));

    }
    public static int countLines (String filename){
        Scanner scannedFile = new Scanner(filename);
        int count = 0;

        try {
            while (scannedFile.hasNextLine()) {
                scannedFile.nextLine();
                count++;
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
        return count;

    }
}


