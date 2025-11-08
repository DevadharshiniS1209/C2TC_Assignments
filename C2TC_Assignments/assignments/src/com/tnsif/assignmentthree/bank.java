package com.tnsif.assignmentthree;

public class bank {
    // Static variable to keep total number of accounts
    private static int totalAccounts = 0;

    // Constructor increments totalAccounts when new account created
    public bank() {
        totalAccounts++;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
