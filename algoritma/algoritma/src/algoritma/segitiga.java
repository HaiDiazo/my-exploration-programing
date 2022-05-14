/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

import java.util.Scanner;
/**
 *
 * @author Mr Nathan
 */
public class segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double luas;
        int alas, tinggi;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Program Hitung Luas Segitiga");
        
        System.out.print("Masukan alas: ");
        alas = input.nextInt();
        
        System.out.print("Masukan tinggi: ");
        tinggi = input.nextInt();
        
        luas = (alas * tinggi)/2;
        
        System.out.println("Luas segitiga adalah " + luas);
        
    }
    
}
