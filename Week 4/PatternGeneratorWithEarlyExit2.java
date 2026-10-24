/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class PatternGeneratorWithEarlyExit2 {
    public static void main(String[] args) {
        int size = 8;
        
        System.out.println("--- Pattern Generator Output ---");
        
        for (int i = 1; i <= size; i++) {
            // Skip row 4 (continue)
            if (i == 4) {
                continue;
            }
            
            for (int j = 1; j <= i; j++) {
                // Stop inner loop at 5th column (break)
                if (j == 5) {
                    break;
                }
                
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
