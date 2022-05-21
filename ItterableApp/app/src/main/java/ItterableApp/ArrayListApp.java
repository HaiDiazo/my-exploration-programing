/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Mr Nathan
 */
public class ArrayListApp {
    
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        
        names.add("Nathan");
        names.add("Joko");
        names.add("Donat");
        
        System.out.println(names.get(1));
        
        names.set(1, "Programmer");
        
        for (String nm : names)
            System.out.println(nm);
    }
    
}
