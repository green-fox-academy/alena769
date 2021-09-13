package com.example.connection.controllers;

import com.example.connection.models.Assignee;
import com.example.connection.repositories.AssigneeRepository;
import com.example.connection.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class AssigneeController {

    private AssigneeService assigneeService;


    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;

    }

    @GetMapping(value = "/assignee/name")
    public String listAssignees(Model model) {

        model.addAttribute("listOfAssignees", assigneeService.findAllAssignee());

        return "assignee";
    }
    //----------DELETE ---------------------------------------

    @GetMapping(value = "/delete/")
    public String delete(@RequestParam Long id) {
        assigneeService.removeAssignee(id);

        return "redirect:/todo/assignee/name";
    }
    // ---- EDIT -----------------------------------
    @GetMapping(value = "/edit")
    public String edit(Model model, @RequestParam Long id) {
    model.addAttribute("assignee", assigneeService.getAssignee(id));

        return "edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Assignee assignee) {
        assigneeService.updateAssignee(assignee);

        return "redirect:/todo/assignee/name";
    }


    // ----------ADD -----------------------------
    @GetMapping(value = "/add/assignee")
    public String addAssignee(Model model) {
        model.addAttribute("newAssignee", new Assignee());

        return "add_assignee";
    }

    @PostMapping(value = "/add/assignee")
    public String addAssignee(@ModelAttribute Assignee assignee, Model model) {
        model.addAttribute("newAssignee", assignee);
        assigneeService.addAssignee(assignee);

        return "redirect:/todo/assignee/name";
    }



















}
