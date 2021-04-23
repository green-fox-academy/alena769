package com.example.dependencies;

import com.example.dependencies.Color.Service.MyColor;
import com.example.dependencies.Hello.Service.Printer;
import com.example.dependencies.UsefulUtilities.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {
    private Printer printer;
    private MyColor myColor;

    @Autowired
    public DependenciesApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }


    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        this.myColor.printColor();

    }
}
