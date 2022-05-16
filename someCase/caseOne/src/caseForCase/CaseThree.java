/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseForCase;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Mr Nathan
 */
public class CaseThree {

    /**
     * @param args the command line arguments
     */
    public static String[][] pushArr(String[][] arr,int size, String buah, int jum)
    {
        String[][] newArr = new String[size + 1][2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        
        newArr[size][0] = buah;
        newArr[size][1] = Integer.toString(jum);
        
        // Bubble sort
        if (newArr.length > 1) {
            for (int i = 0; i < newArr.length; i++) {
                String[][] tempArr = new String[1][2];
                
                if (i < newArr.length - 1) {
                    
                    // Insialisasi angka
                    int a = Integer.parseInt(newArr[i][1]);
                    int b = Integer.parseInt(newArr[i+1][1]);
                    
                    // Process BubbleSort
                    if (a < b) {
                        // save to temp
                        tempArr[0][0] = newArr[i][0];
                        tempArr[0][1] = newArr[i][1];
                        
                        // gantian dari no 2 ke 1
                        newArr[i][0] = newArr[i+1][0];
                        newArr[i][1] = newArr[i+1][1];
                        
                        newArr[i+1][0] = tempArr[0][0];
                        newArr[i+1][1] = tempArr[0][1];
                    }
                }
            }
            
        }
        
        return newArr;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Buatlah program yang membaca file berupa daftar nama buah buahan
         * Abaikan huruf kapital, jadi "Apel" dianggap sama dengan "APEL". 
         * Hitung jumlah kemunculannya lalu tuliskan kembali terurut dari
         * yang terbesar kemunculannya, kecuali yang hanya muncul sekali
         */
        
        String[] buah = {"apel", "mangga", "Durian", "Mangga", "Apel", "MANGGA"};
        String[][] tempBuah = {};
        int cek,k;
        k = 0;
        
        for (int i = 0; i < buah.length; i++) {
            cek = 0;
            
            for (int j = 0; j < buah.length; j++) {
                if (buah[i].toLowerCase().equals(buah[j].toLowerCase())) {
                    cek++;
                }
            }
            
            if (cek > 1) {
                
                if (tempBuah.length == 0) {
                    tempBuah = pushArr(tempBuah, tempBuah.length, buah[i].toLowerCase(), cek);    
                }else{
                    int cek2 = 0;
                    
                    for (int j = 0; j < tempBuah.length; j++) {
                        if (buah[i].toLowerCase().equals(tempBuah[j][0])) {
                            cek2++;
                        }
                    }
                    
                    if (cek2 == 0) {
                        tempBuah = pushArr(tempBuah, tempBuah.length, buah[i].toLowerCase(), cek);
                    }
                }
                k++;
            }

        }
       
        System.out.println("Output:");
        for (int i = 0; i < tempBuah.length; i++) {
            System.out.println(tempBuah[i][0]+ " "+ tempBuah[i][1]);
        }
        
        
    }
    
}
