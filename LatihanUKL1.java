/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl1;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class LatihanUKL1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bilangan;
        System.out.println("Masukkan bilangan : ");
        bilangan = input.nextInt();
        
        if (bilangan % 2 == 0){
            System.out.println("Bilangan Genp");
            System.out.println("Bilangan ini bisa dibagi 2");
        }else{
            System.out.println("Bilangan ganjil");
            System.out.println("Bilangan ini tidak bisa dibagi"+"dibagi2");
            System.out.println("Karena hasil baginya adalah 1");
        }     
    }
}
 
        
    

