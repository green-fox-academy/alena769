import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteSingleLine {
    public static void main(String[] args) {
        String content = "Hello";
        String path = "C:\\Users\\abbel\\IdeaProjects\\alena druhy\\WriteSingleLine.txt";
        try {
            Files.write(Paths.get(path), content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Didn't write into file");
        }

    }


}
