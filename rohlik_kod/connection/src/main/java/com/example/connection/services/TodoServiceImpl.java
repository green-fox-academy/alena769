package com.example.connection.services;

import com.example.connection.models.Todo;
import com.example.connection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{

    private TodoRepository todoRepository;


    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void addTodo(Todo todo) {
        this.todoRepository.save(todo);
    }

    @Override
    public List<Todo> listAllTodo() {

        return todoRepository.findAll();
    }

    @Override
    public void removeTodo(Long id) {
        this.todoRepository.deleteById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public Todo getTodo(Long id) {

        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Todo> findTodoByTitle(String string) {

        return todoRepository.findTodoByTitle(string);
    }

    @Override
    public List<Todo> findByDone(boolean done) {

        return todoRepository.findAllByDone(done);
    }


}
