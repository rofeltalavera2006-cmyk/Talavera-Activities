/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class NestedLoginValidator {
  public static void main(String[] args) {
        System.out.println("--- Testing Failure Paths ---");
        
        System.out.println("\nTest 1: Wrong Username");
        attemptLogin("guestUser", "secret123", false);
        
        System.out.println("\nTest 2: Correct Username, Wrong Password");
        attemptLogin("admin", "wrongPass", false);
        
        System.out.println("\nTest 3: Correct Username & Password, but Account Locked");
        attemptLogin("admin", "secret123", true);
        
        System.out.println("\nTest 4: Valid Login (All correct)");
        attemptLogin("admin", "secret123", false);
    }

    public static void attemptLogin(String inputUser, String inputPass, boolean isLocked) {
        String correctUser = "rofel";
        String correctPass = "secret12345";

        // 1st Stage: Check Username
        if (inputUser.equals(correctUser)) {
            
            // 2nd Stage: Check Password (Nested)
            if (inputPass.equals(correctPass)) {
                
                // 3rd Stage: Check Account Status (Deeply Nested)
                if (!isLocked) {
                    System.out.println("Success: Welcome back, " + inputUser + "!");
                } else {
                    System.out.println("Failure Stage 3: Account is currently locked. Contact support.");
                }
                
            } else {
                System.out.println("Failure Stage 2: Incorrect password.");
            }
            
        } else {
            System.out.println("Failure Stage 1: Username not found in the system.");
        }
    }
}
