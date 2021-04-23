package com.example.dependencies.GreenFoxApp.Controllers;

import com.example.dependencies.GreenFoxApp.Service.StudentServiceImp;
import com.example.dependencies.GreenFoxApp.Service.TextFileStudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxControllers {
    private TextFileStudentServiceImp studentService;
    private boolean isPresent;
    private String nameToCheck;

    @Autowired
    public FoxControllers(TextFileStudentServiceImp students) {
        this.studentService = students;
    }

    // --------- main ----------
    @GetMapping(value = "/gfa")
    public String mainPage(Model model) {
        model.addAttribute("listOfNames", this.studentService.findAll());
        model.addAttribute("count", this.studentService.count());

        return "main";
    }

    // ------------add student --------------------
    @GetMapping(value = "/gfa/add")
    public String addStudent(Model model) {
        model.addAttribute("count", this.studentService.count());

        return "addStudent";
    }

    @PostMapping(value = "/gfa/safe")
    public String safe(@RequestParam String newStudentName) {
        this.studentService.save(newStudentName);

        return "redirect:/gfa/add";
    }

    // ---list student ----------------
    @GetMapping(value = "/gfa/list")
    public String listStudent(Model model) {
        model.addAttribute("listOfNames", this.studentService.findAll());
        model.addAttribute("count", this.studentService.count());

        return "main";
    }

    //----check student -----
    @GetMapping(value = "/gfa/check")
    public String check(Model model) {
        model.addAttribute("count", this.studentService.count());
        model.addAttribute("textForDisplay", nameToCheck);
        model.addAttribute("isPresent", isPresent);


        return "check";
    }
    @PostMapping (value = "/gfa/check")
    public String checkName(@RequestParam String nameToCheck) {
        this.isPresent = this.studentService.isInTheList(nameToCheck);
        this.nameToCheck = nameToCheck;

        return "redirect:/gfa/check";
    }

}