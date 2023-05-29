package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;
    private Account account1;
    private Account account2;

    @Before
    public void setUp() {
        bank = new Bank();
        account1 = new Account("123");
        account2 = new Account("456");
        bank.addAccount(account1);
        bank.addAccount(account2);
    }

    @Test
    public void testAddAccount() {
        assertEquals(2, bank.getAccounts().size());
    }

    @Test
    public void testGetTotalBalance() {
        account1.deposit(100.0);
        account2.deposit(200.0);
        assertEquals(300.0, bank.getTotalBalance(), 0.0);
    }

    @Test
    public void testTransferFunds() {
        account1.deposit(100.0);
        account2.deposit(200.0);

        Transaction transaction = new Transaction(account2, account1, 150.0);
        transaction.execute();

        assertEquals(250.0, account1.getBalance(), 0.0);
        assertEquals(50.0, account2.getBalance(), 0.0);
    }
}
