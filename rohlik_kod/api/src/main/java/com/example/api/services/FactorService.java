package com.example.api.services;

import org.springframework.stereotype.Service;

@Service
public class FactorService {

    public Integer factor(Integer until) {
        Integer factor = 1;

        for (int i = 1; i < until; i++) {
            factor = factor + factor * i;
        }

        return factor;
    }
}
