/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import ItterableApp.Data.Buah;
import ItterableApp.Data.BuahComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Mr Nathan
 */
public class SortFrequency {
    public static void main(String[] args){
        String[] buah = {"apel", "durian", "durian" ,"Mangga", "Apel", "MANGGA", "mangga", "anggur", "anggur","anggur","anggur"};
        
        Map<String, Integer> buah1 = new HashMap<>();
        
        for (String s : buah) {
            if (buah1.containsKey(s.toLowerCase())) {
                buah1.put(s.toLowerCase(), buah1.get(s.toLowerCase()) + 1);
            }else{
                buah1.put(s.toLowerCase(), 1);
            }
        }
        
        System.out.println(buah1);
        
//        SortedSet<Buah> al = new TreeSet<>(new BuahComparator());
        List<Buah> al = new ArrayList<Buah>();
        for(Map.Entry<String, Integer> t : buah1.entrySet()) {
            al.add(new Buah(t.getValue(), t.getKey()));
        }
        
        al.sort(new BuahComparator());
        
        
        for (Buah buah2 : al) {
            System.out.println(buah2.getNamaBuah() + " " + buah2.getCount());    
        }
    }
}
