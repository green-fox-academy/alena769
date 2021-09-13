package com.example.api.services;

import org.springframework.stereotype.Service;

@Service
public class AppendAService {

    public String append(String original) {

        return original + "a";
    }

}
