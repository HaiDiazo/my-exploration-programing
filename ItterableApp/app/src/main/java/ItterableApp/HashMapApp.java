/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mr Nathan
 */
public class HashMapApp {
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        
        map.put("name.first", "Nathan");
        map.put("name.middle", "Aptanta");
        map.put("name.last", "parama");
        
        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
