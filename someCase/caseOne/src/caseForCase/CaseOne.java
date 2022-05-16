/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseForCase;

/**
 *
 * @author Mr Nathan
 */
public class CaseOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* 
        * Tulislah sebuah program yang menuliskan ke layar print angka 
        * dari 1 sampai 100, tetapi untuk setiap kelipatan 3 diganti dengan
        * menuliskan kata "snip", setiap kelipatan 5 diganti menuliskan "snap"
        * dan setiap kelipatan 3 dan 5 menuliskan "snip-snap".
        */
        
        
        for(int i = 1; i <= 100 ; i++)
            if (i%3 == 0 && i%5 == 0) 
            {
                System.out.print("snip-snap,");
            }else if(i%3 == 0)
            {
                System.out.print("snip,");
            }else if(i%5 == 0)
            {
                System.out.print("snap,");
            }else{
                System.out.print(i + ",");
            }
        
        
    }
    
}
