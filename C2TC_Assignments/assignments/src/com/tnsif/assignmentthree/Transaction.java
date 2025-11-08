package com.tnsif.assignmentthree;

public class Transaction {
    // Final variable for transaction fee
    private final double transactionFee = 10.0;

    // Final method to ensure consistent transaction process
    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\n--- Transaction Start ---");

        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount);
                account.withdraw(transactionFee);
                System.out.println("Transaction fee ₹" + transactionFee + " applied.");
                break;

            case "withdraw":
                account.withdraw(amount + transactionFee);
                System.out.println("Transaction fee ₹" + transactionFee + " applied.");
                break;

            default:
                System.out.println("Invalid transaction type!");
        }

        System.out.println("Final Balance: ₹" + account.getBalance());
        System.out.println("--- Transaction End ---\n");
    }
}
