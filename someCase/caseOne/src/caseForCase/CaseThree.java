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
        
        for (int i = 0; i < buah.length; i++) {
            cek = 0;
            k = 0;
            
            for (int j = 0; j < buah.length; j++) {
                if (buah[i].toLowerCase() == buah[j].toLowerCase()) {
                    cek++;
                }
            }
            
            if (cek > 1) {
                if (!(tempBuah.length > 0)) {
                    tempBuah[k][0] = buah[i];
                    tempBuah[k][1] = Integer.toString(cek);
                }else{
                    int cek2 = 0;
                    for (int j = 0; j < tempBuah.length; j++) {
                        if (buah[i] != tempBuah[j][0]) {
                            // Apa yang terjadi klo buah buah tidak sama di temporary?
                            // ingin klo tidak sama input ke db
                            
                        }
                    }
                    
                }
            }
        }
        
        
    }
    
}
