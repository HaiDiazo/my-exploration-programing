/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mr Nathan
 */
public class NavigableSetApp {
    public static void main(String[] args)
    {
//     Urutin secara Ascending
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Nathan", "Aptanta", "Parama", "Programmer"));
        
//      Urutin secara Descending
        NavigableSet<String> namesDesc = names.descendingSet();
        
//      Dikasih untuk slicing dari depan ke belakang
        NavigableSet<String> aptanta = names.headSet("Parama", true);
        
//      Untuk slicing dari belakang ke depan
        NavigableSet<String> parama = names.tailSet("Parama", true);
        
        
        for (String name : parama) {
            System.out.println(name);
        }
    }
}
