package com.example.dependencies;

import com.example.dependencies.Hello.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {
    private Printer printer;

    @Autowired
    public DependenciesApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");

    }
}
