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
public class Tugas1 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int[] data = new int[] {5000, 2000, 1000, 500, 100};
        int[] hasil = new int[5];
        int jumlah, x;
        int temp = 0;
        System.out.print("Masukkan nilai Rupiah: ");
        jumlah = baca.nextInt();
        