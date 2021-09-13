package com.example.api;

import com.example.api.models.FactorDTO;
import com.example.api.services.FactorService;
import com.example.api.services.ReverserService;
import com.example.api.services.SumService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);

        ReverserService reverserService = new ReverserService();

        System.out.println(reverserService.rest("This is my example sentence. Just for fun."));
    }

}
