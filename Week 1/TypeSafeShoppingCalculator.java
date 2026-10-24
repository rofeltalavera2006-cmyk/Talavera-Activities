/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        String storeName = "Tech Storage";
        int quantity = 4;
        double unitPrice = 18.99;

        double totalCost = quantity * unitPrice;

        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);
    }
}

