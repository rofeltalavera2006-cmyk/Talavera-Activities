/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */

import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {
        int[] scores = {90, 94, 88, 76, 88, 76, 95, 83};
        
        System.out.println("--- Linear Search ---");
        int target = 76;
        boolean isFound = false;
        int targetIndex = -1;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                isFound = true;
                targetIndex = i;
                break;
            }
        }
        
        if (isFound) {
            System.out.println("Target score " + target + " was found at index " + targetIndex + ".");
        } else {
            System.out.println("Target score " + target + " was not found in the array.");
        }
        
        System.out.println("\n--- Sorting ---");
        
        // We sort a copy so the original array's order (which might link scores to specific students) is not lost.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
        
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Copy:    " + Arrays.toString(sortedScores));
    }
}

