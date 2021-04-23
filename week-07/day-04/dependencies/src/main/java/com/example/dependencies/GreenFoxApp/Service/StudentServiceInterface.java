package com.example.dependencies.GreenFoxApp.Service;

import java.util.List;

public interface StudentServiceInterface {
     List<String> findAll();
     void save(String student);
     int count();
     boolean isInTheList(String nameToCheck);
}
