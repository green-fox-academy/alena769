package com.example.dependencies.Color.Model;

import com.example.dependencies.Color.Service.MyColor;
import com.example.dependencies.Hello.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;


public class RedColor implements MyColor {
    private Printer printer;

    @Autowired
    public RedColor(Printer printer) {
        this.printer = printer;
    }


    @Override
    public void printColor() {
        this.printer.log("this is red");
    }
}
