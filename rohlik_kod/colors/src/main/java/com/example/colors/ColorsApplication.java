package com.example.colors;

import com.example.colors.Model.RedColor;
import com.example.colors.Service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication{
    private MyColor color;

    @Autowired
    public ColorsApplication(MyColor color) {
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }
}
