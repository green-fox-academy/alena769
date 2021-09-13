package com.bankofsimba.demo.Controllers;

import com.bankofsimba.demo.Classes.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
    List<BankAccount> bankAccountList;

    public BankAccountController() {
        bankAccountList = new ArrayList<>();
        BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);
        bankAccountList.add(bankAccount);
        BankAccount bankAccount1 = new BankAccount("Fifa", 10, "turtle", false);
        bankAccountList.add(bankAccount1);
    }

    @GetMapping(value = "/show")
    public String show(Model model) {
        model.addAttribute("bankAccountList", this.bankAccountList);

        return "index";
    }

    @GetMapping(value = "/add")
    public String showTable() {

        return "Add";
    }

    @PostMapping(value = "/add")
    public String addBankAccount(@ModelAttribute BankAccount bankAccount) {

        bankAccountList.add(bankAccount);

        return "redirect:/add";
    }
}
