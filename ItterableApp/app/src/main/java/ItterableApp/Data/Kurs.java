/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp.Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mr Nathan
 */
public class Kurs {
    
    private Map<String, Integer> kursMoney = new HashMap<>();
    
    public void setKurs(String idKurs, int money)
    {
        kursMoney.put(idKurs, money);
    }
    
    public boolean cekKurs(String idKurs)
    {
        if (kursMoney.containsKey(idKurs)) {
            return true;
        }else{
            return false;
        }
    }
    
    public Integer getKurs(String idKurs)
    {
        return kursMoney.get(idKurs);
    }
    
    public void getAll()
    {
        System.out.println("Data KURS:");
        for(String key: kursMoney.keySet())    
            System.out.println(key +" "+ kursMoney.get(key));
    }
}
