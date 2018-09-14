/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.Scanner;

/**
 *
 * @author M E G A S T A R
 */
public class Tugas02 {
    public static void main(String[] args) {
        int[] Berat = new int[] {7, 5, 4, 3, 2};
        int[] Harga = new int[] {10000, 7000, 5000, 3000, 2000};
        
        int berat = imput();
        
        Proses(berat, Berat, Harga);
        
    }
    