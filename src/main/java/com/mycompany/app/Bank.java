package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("123");
        Account account2 = new Account("456");

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(100.0);
        account2.deposit(200.0);

        System.out.println("Total balance in the bank: " + bank.getTotalBalance());
    }
}
