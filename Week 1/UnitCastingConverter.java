/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class UnitCastingConverter {
  public static void main(String[] args) {
        double totalCentimeters = 200.99;

        int wholeMeters = (int) (totalCentimeters / 200);
        double remainingCentimeters = totalCentimeters % 200;

        System.out.println("Total Centimeters: " + totalCentimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        int itemQuantity = 60;
        double exactQuantity = itemQuantity;
        System.out.println("Implicit Widening: " + exactQuantity);

        double targetPrice = 100.99;
        int wholePrice = (int) targetPrice;
        System.out.println("Explicit Narrowing: " + wholePrice);
    }
}   

