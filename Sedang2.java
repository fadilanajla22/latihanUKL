/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sedang2;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class Sedang2 {

    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        double phi=3.14;
        System.out.println("Masukkan jari2");
        double jari2=input.nextDouble();
        System.out.println("Masukkan Tinggi");
        double Tinggi=input.nextDouble();
        
        double luas=0;
        luas = 2*phi*jari2*(jari2+Tinggi);
        System.out.println("hasil"+luas);
        
    }
}
        
