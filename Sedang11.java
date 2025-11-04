/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sedang11;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class Sedang11 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int Nilai=0;
        System.out.println("Masukkan nilai :");
        Nilai = inputan.nextInt();
        int Hasil=1;
        int Faktorial=10;
        while (Faktorial >=1 ){
            Hasil *= Faktorial;
            System.out.println("faktor ke - "+Faktorial);
            Faktorial--;  
    }
    System.out.println("Faktorial dari." + Nilai + ".adalah." + Hasil);
    
    }
}
