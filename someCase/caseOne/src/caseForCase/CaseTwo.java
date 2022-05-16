/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseForCase;

import java.util.Arrays;
/**
 *
 * @author Mr Nathan
 */
public class CaseTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Diketahui sebuah array terdiri pasangan bilangan, kecuali 
         * satu yang tidak berpasangan. Buatlah program yang menentukan posisi
         * bilangan tersebut dalam array
         */
        
        int[] arr = {102, 32, 99, 32, 45, 102, 45, 67, 67, 100, 100};
        int cek;
        
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            cek = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cek++;
                }
            }
            
            if (cek == 1) {
                int index = i + 1;
                
                System.out.println("Maka bilangan yang tidak berpasangan"
                        + " adalah " + arr[i] + " pada posisi ke-"+ index);
            }
        }
        
    }
    
}
