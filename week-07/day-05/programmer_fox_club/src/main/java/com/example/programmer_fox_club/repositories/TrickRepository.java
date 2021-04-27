package com.example.programmer_fox_club.repositories;

import com.example.programmer_fox_club.models.Trick;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class TrickRepository {
    private List<Trick> trickList;

    public TrickRepository() {
        this.trickList = new ArrayList<>(Arrays.asList(
                new Trick("dance"),
                new Trick("read newspaper")));
    }

    public List<Trick> findALl() {

        return trickList;
    }
}
