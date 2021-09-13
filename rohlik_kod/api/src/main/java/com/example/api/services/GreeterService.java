package com.example.api.services;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {

    public String errorName() {

        return "Please provide a name!";
    }

    public String errorTitle() {

        return "Please provide a title!";
    }

    public String bothMissing() {

        return "Please provide a name and a title!";
    }

}
