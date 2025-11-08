package com.tnsif.assignmentthree;

public class CheckingAccount extends Account {
    private double overdraftLimit = 1000.0;

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}