/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sulit1;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class Sulit1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      System.out.println("Masukan n1");
        double n1=input.nextDouble();
      System.out.println("Masukan n2");
        double n2=input.nextDouble();
      System.out.println("Masukkan n3");
        double n3=input.nextDouble();
      
        double jumlah=n1+n2+n3;
      double bagi=jumlah/3;
      System.out.println("hasil"+bagi);
      
    }
}

