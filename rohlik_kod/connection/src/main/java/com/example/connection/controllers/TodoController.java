package com.example.connection.controllers;

import com.example.connection.models.Todo;
import com.example.connection.services.AssigneeService;
import com.example.connection.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/todo")
public class TodoController {


    private TodoService todoService;
    private AssigneeService assigneeService;


    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    //----------------list of todos ----------------------------------------------
    @GetMapping(value = {"/", "/list"})
    public String list(Model model,
                       @RequestParam(required = false) Boolean isActive,
                       @RequestParam(required = false) String title) {

        if (title != null) {
            model.addAttribute("todos", todoService.findTodoByTitle(title));

            return "todolist";
        } else {
            if (isActive == null) {
                model.addAttribute("todos", todoService.listAllTodo());

                return "todolist";
            } else {
                model.addAttribute("todos", this.todoService.findByDone(isActive));

                return "todolist";
            }

        }
    }
        //------------ADD TODOS --------------------------------------------------------------
        @GetMapping("/add")
        public String greetingForm (Model model){
            model.addAttribute("newTodo", new Todo());
            return "add_todo";
        }

        @PostMapping("/add")
        public String greetingSubmit (@ModelAttribute Todo todo, Model model){
            model.addAttribute("newTodo", todo);
            todoService.addTodo(todo);

            return "redirect:/todo/list";
        }


        //------------DELETE -------------------------
        @GetMapping(value = "/delete/todo")
        public String delete (@RequestParam Long id){
            todoService.removeTodo(id);

            return "redirect:/todo/list";
        }


        // ----------------EDIT  -------------------------------------
        @GetMapping(value = "/edit/todo")
        public String edit (Model model, @RequestParam Long id){
            model.addAttribute("todo", todoService.getTodo(id));
            model.addAttribute("assigneeList", assigneeService.findAllAssignee());

            return "edit_todo";
        }

        @PostMapping(value = "/edit/todo")
        public String edit (@ModelAttribute Todo todo){
            todoService.updateTodo(todo);

            return "redirect:/todo/list";
        }


    }
