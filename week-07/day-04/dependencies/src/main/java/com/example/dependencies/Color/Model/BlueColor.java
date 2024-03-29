package com.example.dependencies.Color.Model;

import com.example.dependencies.Color.Service.MyColor;
import com.example.dependencies.Hello.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
    private Printer printer;

    @Autowired
    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        this.printer.log("this is blue");
    }
}
