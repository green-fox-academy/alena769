package com.example.programmer_fox_club.services;

import com.example.programmer_fox_club.models.Fox;
import com.example.programmer_fox_club.models.Trick;

import java.util.List;

public interface FoxesService {
    Fox findAFox(String name);
    void saveAFox(String name);
    void addTrick(String name, String trick);
    void updateFox(Fox fox);
    List<Trick> listTricks();

}
