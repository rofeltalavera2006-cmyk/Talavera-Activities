/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rofel1;

/**
 *
 * @author lenovo
 */
public class FavoriteThingsArray {
     public static void main(String[] args) {
        String[] favorites = {"Music", "Streetfoods", "Games", "Sleeping", "Basketball"};
        
        System.out.println("--- My Favorite Things ---");
        
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }
        
        System.out.println("\nTotal items in the list: " + favorites.length);
    }
}

