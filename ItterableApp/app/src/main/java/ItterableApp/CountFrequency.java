/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mr Nathan
 */
public class CountFrequency {
    
    public static void CountFrequency(ArrayList<String> buah)
    {
        Set<String> coba = new HashSet<>(buah);
        
        for(var e: coba){
            if (Collections.frequency(buah, e) > 1) {
                System.out.println(e + " " + Collections.frequency(buah, e));
            }
        }
        
        System.out.println("==================\n");
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> buah = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String data;
        Boolean ulang = true;
        
        while(ulang)
        {
            System.out.print("Masukan buah: ");
            data = input.nextLine();
            
            if (data.equals("EXIT")) {
                ulang = false;
            }else{
                buah.add(data);
                CountFrequency(buah);
            }
        }
        
    }
}
