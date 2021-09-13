package com.example.connection.repositories;

import com.example.connection.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {

    @Query(value = "select * from assignee where assignee.name = ?1", nativeQuery = true)
    Assignee searchAssigneeName(String name);

    @Query(value = "select * from assignee where assignee.email = ?1", nativeQuery = true)
    Assignee searchAssigneeEmail(String email);


}
