/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class OverflowReferenceInvestigator {
  public static void main(String[] args) {
        byte maxByte = 127;
        maxByte++;
        System.out.println("Overflowed byte value: " + maxByte);

        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray;

        sharedArray[0] = 99;

        System.out.println("Original Array index 0 after modifying Shared Array: " + originalArray[0]);
    }
}
  
