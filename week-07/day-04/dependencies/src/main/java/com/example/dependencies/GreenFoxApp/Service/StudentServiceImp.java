package com.example.dependencies.GreenFoxApp.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class StudentServiceImp implements StudentServiceInterface{
    private List<String> names;

    public StudentServiceImp() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int count() {

        return this.names.size();
    }

    public boolean isInTheList(String nameToCheck) {

       return this.names.stream().anyMatch(names -> names.equals(nameToCheck));
    }
}