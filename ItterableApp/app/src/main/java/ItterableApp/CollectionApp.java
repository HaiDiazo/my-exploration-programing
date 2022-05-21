/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Mr Nathan
 */
public class CollectionApp {
    
    public static void main(String[] args)
    {
        Collection<String> collection = new ArrayList<>();
        
        collection.add("nathan");
        collection.add("aptanta");
        collection.add("parama");
        
        // Bisa pakai addAll object
        collection.addAll(List.of("Apa", "aja", "ini"));
        
        for(var value: collection)
            System.out.println(value);
        
        System.out.println("===========\n");
        System.out.println("REMOVE");
        
        collection.remove("aja");
        
        for(var value: collection)
            System.out.println(value);
        
    }
}
