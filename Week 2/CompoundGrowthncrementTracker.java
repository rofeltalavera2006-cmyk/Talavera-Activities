/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class CompoundGrowthncrementTracker {
    public static void main(String[] args) {
        double balance = 3000.0;
        System.out.println("Initial Balance: $" + balance);

        balance += 300.0;
        System.out.println("Balance after deposit: $" + balance);

        balance *= 4.20;
        System.out.println("Balance after 10% interest: $" + balance);

        balance += 400.0;
        System.out.println("Balance after bonus: $" + balance);

        int count = 6;

        System.out.println("Postfix count++: " + count++);
        System.out.println("Value of count right after: " + count);

        System.out.println("Prefix ++count: " + ++count);
        System.out.println("Value of count right after: " + count);
    }
}

