/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class PrecedencePuzzleSolver {
     public static void main(String[] args) {
        int a = 10, b = 14, c = 3;
        // Prediction: false
        boolean result1 = a + b * c > 20 && b-- > 10;
        System.out.println("Expression 1 Result: " + result1);

        int x = 4, y = 3;
        // Prediction: true
        boolean result2 = ++x * 2 >= 10 || y++ < 3;
        System.out.println("Expression 2 Result: " + result2);

        int m = 8, n = 2;
        // Prediction: 4
        int result3 = m + n * 3 / 2 - --m;
        System.out.println("Expression 3 Result: " + result3);
    }
}

