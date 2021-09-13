package com.example.dependencies.GreenFoxApp.Service;

import org.springframework.stereotype.Service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Service
public class TextFileStudentServiceImp implements StudentServiceInterface{
    private Path path;
    private List<String> studentNames;

    public TextFileStudentServiceImp() {
        this.path = Path.of("src/main/java/com/example/dependencies/GreenFoxApp/txtFile/Students.txt");
    }

    @Override
    public List<String> findAll() {
        try {
           this.studentNames = Files.readAllLines(this.path);
        }catch (IOException e) {
            System.out.println("Cant read the file");
        }
        return this.studentNames;
    }

    @Override
    public void save(String student) {
       List<String> namesFromFile = findAll();

       String studentNewLine = student.substring(0,1).toUpperCase() + student.substring(1) + "\n";

        try {
            Files.write(this.path, studentNewLine.getBytes(), StandardOpenOption.APPEND);

        }catch (IOException e) {
            System.out.println("Cant read the file");
        }
    }

    @Override
    public int count() {
        List<String> lines = findAll();

        return lines.size();
    }

    @Override
    public boolean isInTheList(String nameToCheck) {
        List<String> lines = findAll();

        return lines.stream().anyMatch(names -> names.equals(nameToCheck));
    }
}
