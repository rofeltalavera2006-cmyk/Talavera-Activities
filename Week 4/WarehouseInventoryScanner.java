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

public class WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] warehouse = {
            { 10, 17, -1, -4 },
            { 9, 1, -2, 13 },
            { 20, 6, 7, 18 }
        };

        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY MENU ===");
            System.out.println("1. Calculate Total Inventory");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Restock Item");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int total = 0;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] == -1) {
                                continue;
                            }
                            total += warehouse[i][j];
                        }
                    }
                    System.out.println("Total Inventory Count: " + total);
                    break;

                case 2:
                    boolean found = false;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] >= 0 && warehouse[i][j] < 5) {
                                System.out.println("Critically low shelf found at Aisle " + i + ", Shelf " + j + " (Count: " + warehouse[i][j] + ")");
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No low stock shelves found.");
                    }
                    break;

                case 3:
                    restock(scanner);
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void restock(Scanner scanner) {
        while (true) {
            System.out.print("Enter amount to add to stock (must be positive): ");
            int amount = scanner.nextInt();

            if (amount > 0) {
                System.out.println("Successfully added " + amount + " items.");
                return;
            }

            System.out.println("Invalid input! Amount must be greater than 0.");
        }
    }
}

