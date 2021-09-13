package com.example.connection.services;

import com.example.connection.models.Assignee;

import java.util.List;

public interface AssigneeService {

    void addAssignee(Assignee assignee);

    void removeAssignee(Long id);

    List<Assignee> findAllAssignee();

    void updateAssignee(Assignee assignee);

    Assignee getAssignee(Long id);
}
