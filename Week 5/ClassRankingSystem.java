/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class ClassRankingSystem {
    public static void main(String[] args) {
        String[] rawNames = {"James", "Curry", "Durant", "Sotto", "Ramos"};
        
        int[][] rawScores = {
            {94, 87, 95, 92},
            {80, 80, 85, 91},
            {95, 87, 92, 96},
            {80, 94, 99, 85},
            {77, 74, 80, 76}
        };

        Student[] students = new Student[rawNames.length];
        for (int i = 0; i < rawNames.length; i++) {
            students[i] = new Student(rawNames[i], rawScores[i]);
        }

        customSortByAverage(students);

        assignRanks(students);

        System.out.println("--- CLASS LEADERBOARD ---");
        System.out.printf("%-5s %-10s %-10s %-20s\n", "RANK", "NAME", "AVERAGE", "QUIZZES");
        System.out.println("--------------------------------------------------");
        for (Student s : students) {
            System.out.printf("%-5d %-10s %-10.1f %-20s\n", 
                s.rank, s.name, s.average, arrayToString(s.quizzes));
        }

        System.out.println("\n--- SEARCH RESULT ---");
        String searchName = "Michael Jordan";
        int foundRank = findStudentRank(students, searchName);
        if (foundRank != -1) {
            System.out.println(searchName + " is ranked #" + foundRank);
        } else {
            System.out.println(searchName + " was not found.");
        }
    }

    public static void customSortByAverage(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].average > arr[maxIndex].average) {
                    maxIndex = j;
                }
            }
            Student temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void assignRanks(Student[] arr) {
        arr[0].rank = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].average == arr[i - 1].average) {
                arr[i].rank = arr[i - 1].rank;
            } else {
                arr[i].rank = i + 1;
            }
        }
    }

    public static int findStudentRank(Student[] arr, String targetName) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(targetName)) {
                return arr[i].rank;
            }
        }
        return -1; 
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

class Student {
    String name;
    int[] quizzes;
    double average;
    int rank;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        this.average = calculateAverage();
    }

    private double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < quizzes.length; i++) {
            sum += quizzes[i];
        }
        return (double) sum / quizzes.length;
    }
}

