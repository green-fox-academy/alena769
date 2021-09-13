package com.example.api.services;

import org.springframework.stereotype.Service;

@Service
public class SumService {

    public Integer sum(Integer until) {
        int n = 0;
       Integer sum = 0;

        for (int i = 0; i <= until; i++) {
            sum =sum + n + i;
        }

        return sum;
    }

}
