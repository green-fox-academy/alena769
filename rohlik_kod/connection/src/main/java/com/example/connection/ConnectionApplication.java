package com.example.connection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConnectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
