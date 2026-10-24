/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {
        double average = 92.5;
        int absences = 3;

        boolean isPassed = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average Grade: " + average);
        System.out.println("Absences: " + absences);

        if (isPassed) {
            System.out.println("Status: PASS");
            System.out.println("Reason: Met passing criteria (Grade >= 75 with <= 3 absences, OR Grade >= 90).");
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reason: Grade below required threshold or excessive absences.");
        }
    }
}

