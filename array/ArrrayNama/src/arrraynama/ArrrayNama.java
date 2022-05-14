/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrraynama;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mr Nathan
 */
public class ArrrayNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Inisialisasi
        String[] nama = {"Nathan", "Donat", "Natadecoco"};
        
//        Buat Objek 
        Scanner input = new Scanner(System.in);
        
        System.out.println(Arrays.toString(nama));
        
        System.out.println("\nPrint Out dengan Foreach:");
        for(String n: nama)
        {
            System.out.println(n); 
        }
        
        
        
        
        
    }
    
}
