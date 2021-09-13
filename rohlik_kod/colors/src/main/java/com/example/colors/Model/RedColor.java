package com.example.colors.Model;

import com.example.colors.Service.MyColor;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("this is red");
    }
}
