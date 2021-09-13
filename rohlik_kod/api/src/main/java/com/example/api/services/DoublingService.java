package com.example.api.services;

import com.example.api.models.DoublingDTO;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {

    public DoublingService() {
    }

    public Integer doubleDoubling(Integer input) {

        return input * 2;
    }
}
