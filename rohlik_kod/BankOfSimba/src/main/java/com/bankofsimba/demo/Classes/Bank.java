package com.bankofsimba.demo.Classes;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<BankAccount> bankClients;

    public Bank() {
        this.bankClients = new ArrayList<>();
    }

    public List<BankAccount> getBankClients() {
        return bankClients;
    }

    public void addNewClient(BankAccount client) {
        this.bankClients.add(client);
    }

    public void setBankClients(List<BankAccount> bankClients) {
        this.bankClients = bankClients;
    }
}
