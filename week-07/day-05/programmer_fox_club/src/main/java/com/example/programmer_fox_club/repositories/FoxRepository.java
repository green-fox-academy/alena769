package com.example.programmer_fox_club.repositories;

import com.example.programmer_fox_club.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxRepository {
    private List<Fox> foxList;

    public FoxRepository() {
        this.foxList = new ArrayList<>();
    }
    public List<Fox> findAll() {

        return foxList;
    }

}
