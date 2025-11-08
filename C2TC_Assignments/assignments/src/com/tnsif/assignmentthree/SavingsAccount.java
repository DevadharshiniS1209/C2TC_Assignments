package com.tnsif.assignmentthree;

public class SavingsAccount extends Account {
    private double interestRate = 0.03; // 3% interest rate

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited ₹" + amount + " with interest. New Balance: ₹" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
