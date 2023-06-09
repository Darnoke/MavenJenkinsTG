package com.mycompany.app;

public class Transaction {
    private Account sender;
    private Account receiver;
    private double amount;

    public Transaction(Account sender, Account receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public void execute() {
        if (sender.getBalance() >= amount) {
            sender.withdraw(amount);
            receiver.deposit(amount);
        }
    }
}
