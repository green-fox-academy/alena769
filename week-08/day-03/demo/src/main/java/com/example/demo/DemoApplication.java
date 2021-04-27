package com.example.demo;

import com.example.demo.models.Todo;
import com.example.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private TodoRepository todoRepository;


    @Autowired
    public DemoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;

    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn"));
        todoRepository.save(new Todo("Clean stalls"));
        todoRepository.save(new Todo("Learn to fly"));

    }
}
