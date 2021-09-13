package com.example.connection.services;

import com.example.connection.models.Assignee;
import com.example.connection.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssigneeServiceImpl implements AssigneeService{

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public void addAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public List<Assignee> findAllAssignee() {

        return assigneeRepository.findAll();
    }

    @Override
    public void updateAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public Assignee getAssignee(Long id) {

        return assigneeRepository.findById(id).orElse(null);
    }

    @Override
    public void removeAssignee(Long id) {
        assigneeRepository.deleteById(id);
    }


}
