package com.example.programmer_fox_club.services;

import com.example.programmer_fox_club.models.Fox;
import com.example.programmer_fox_club.models.Trick;
import com.example.programmer_fox_club.repositories.FoxRepository;
import com.example.programmer_fox_club.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FoxesServiceImp implements FoxesService {

    private FoxRepository foxRepository;
    private TrickRepository trickRepository;

    @Autowired
    public FoxesServiceImp(TrickRepository tricks, FoxRepository foxRepository) {
        this.trickRepository = tricks;
        this.foxRepository = foxRepository;
    }

    @Override
    public Fox findAFox(String name) {

        return foxRepository.findAll().stream().filter(f -> f.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public void saveAFox(String name) {
        this.foxRepository.findAll().add(new Fox(name));
    }


    @Override
    public void addTrick(String name, String trick) {

        Fox fox = findAFox(name);
        fox.getTricks().add(new Trick(trick));
    }


    @Override
    public void updateFox(Fox fox) {
       Fox foxToUpdate = findAFox(fox.getName());
       foxToUpdate.setDrink(fox.getDrink());
       foxToUpdate.setFood(fox.getFood());

    }

    @Override
    public List<Trick> listTricks() {
        return trickRepository.findALl();
    }


}
