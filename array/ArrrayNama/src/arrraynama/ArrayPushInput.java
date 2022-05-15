/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrraynama;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Mr Nathan
 */
public class ArrayPushInput {

    /**
     * @param args the command line arguments
     */
    
    public static String[] pushArr(int n, String arr[], String val)
    {
        
        // Inisialisasi variabel
        String[] newarr = new String[n + 1];
        
        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];
        
        newarr[n] = val;
        
        return newarr;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inisialisasi
        String[] nama = {"Dian", "Donat", "Happy", "Telo"};
        String push;
        
        // Objek 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nama baru: ");
        push = input.nextLine();
        
        nama = pushArr(nama.length, nama, push);
        
        System.out.println(Arrays.toString(nama));
    }
    
}
