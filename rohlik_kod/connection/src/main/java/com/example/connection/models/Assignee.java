package com.example.connection.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    public Assignee (String name, String email) {
        this.name = name;
        this.email = email;
    }

    @OneToMany(mappedBy = "assignee")
    private List<Todo> todoList;

    public Assignee() {

    }

    public void addTodo(Todo todo) {
        this.todoList.add(todo);
    }

    public List<Todo> getTodo() {
        return todoList;
    }

    public void setTodo(List<Todo> todoList) {
        this.todoList = todoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
