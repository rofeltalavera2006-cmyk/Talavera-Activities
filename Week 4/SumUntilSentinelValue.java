/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */

    import java.util.Scanner;

public class SumUntilSentinelValue {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter numbers to sum (enter -1 to stop):");
        int input = scanner.nextInt();

        while (input != -1) {
            total += input;
            input = scanner.nextInt();
        }

        System.out.println("Final Total: " + total);

        scanner.close();
    }
}

