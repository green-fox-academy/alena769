package com.example.connection.repositories;

import com.example.connection.models.Assignee;
import com.example.connection.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findTodoByTitle(String name);

    @Query(value = "select * from todo where todo.done = false", nativeQuery = true)
    List<Todo> activeTodo();

    @Query(value = "select * from todo where todo.done = true", nativeQuery = true)
    List<Todo> finishedTodo();

    List<Todo> findAllByDone(boolean done);
}
