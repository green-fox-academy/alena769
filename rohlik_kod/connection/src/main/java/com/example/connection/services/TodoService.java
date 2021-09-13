package com.example.connection.services;

import com.example.connection.models.Assignee;
import com.example.connection.models.Todo;

import java.util.List;

public interface TodoService {
    void addTodo(Todo todo);
    List<Todo> listAllTodo();
    void removeTodo(Long id);
    void updateTodo(Todo todo);
    Todo getTodo(Long id);
    List<Todo> findTodoByTitle(String string);
   List<Todo> findByDone(boolean done);
}
