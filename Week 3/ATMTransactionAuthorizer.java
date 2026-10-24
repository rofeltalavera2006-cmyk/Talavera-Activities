/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        String correctUsername = "Talavera";
        int correctPin = 1234;

        String inputUsername = "Talavera";
        int inputPin = 2468;

        double balance = 5000.00;
        double withdrawalAmount = 1500.00;

        if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin) {
                String tier;
                double dailyLimit;

                if (balance >= 10000.0) {
                    tier = "Platinum";
                    dailyLimit = 5000.0;
                } else if (balance >= 5000.0) {
                    tier = "Gold";
                    dailyLimit = 2500.0;
                } else if (balance >= 1000.0) {
                    tier = "Silver";
                    dailyLimit = 1500.0;
                } else {
                    tier = "Bronze";
                    dailyLimit = 500.0;
                }

                double feeRate;
                switch (tier) {
                    case "Platinum":
                        feeRate = 0.00;
                        break;
                    case "Gold":
                        feeRate = 0.01;
                        break;
                    case "Silver":
                        feeRate = 0.02;
                        break;
                    default:
                        feeRate = 0.03;
                        break;
                }

                double transactionFee = withdrawalAmount * feeRate;
                double totalAmount = withdrawalAmount + transactionFee;

                if (withdrawalAmount <= dailyLimit) {
                    if (totalAmount <= balance) {
                        balance -= totalAmount;
                        System.out.println("STATUS: TRANSACTION APPROVED");
                        System.out.println("Account Tier: " + tier);
                        System.out.println("Withdrawn Amount: $" + withdrawalAmount);
                        System.out.println("Transaction Fee (" + (int)(feeRate * 100) + "%): $" + transactionFee);
                        System.out.println("Remaining Balance: $" + balance);
                    } else {
                        System.out.println("STATUS: TRANSACTION DENIED");
                        System.out.println("Reason: Insufficient funds to cover withdrawal and fee ($" + totalAmount + " required).");
                    }
                } else {
                    System.out.println("STATUS: TRANSACTION DENIED");
                    System.out.println("Reason: Requested amount exceeds the daily limit of $" + dailyLimit + " for " + tier + " tier.");
                }

            } else {
                System.out.println("STATUS: TRANSACTION DENIED");
                System.out.println("Reason: Invalid 4-digit PIN.");
            }
        } else {
            System.out.println("STATUS: TRANSACTION DENIED");
            System.out.println("Reason: Invalid Username.");
        }
    }
}
 
