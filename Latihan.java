/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.print("Masukkan panjang : ");        
        int panjang=input.nextInt();
         System.out.print("Masukkan lebar : ");
        int lebar=input.nextInt();
         System.out.print("Masukkan tinggi : ");
        int tinggi=input.nextInt();
        
        int volume=0;
        volume = panjang*lebar*tinggi;
        System.out.println("hasil"+volume);
        
        System.out.println("Masukkan jarak : ");
        int jarak = input.nextInt();
        System.out.println("Masukkan berat : ");
        int berat = input.nextInt();
        
        int biayaPerKg = 0;
        
        if (jarak <= 10) {
            biayaPerKg = jarak*4250;
        } else {
            biayaPerKg = jarak*6000;
        }
        int biaya = berat * biayaPerKg;
        System.out.println("hasil"+biaya);
       
        System.out.print("Masukkan sebuah bilangan: ");
         int bil = input.nextInt();
         
    }
}
