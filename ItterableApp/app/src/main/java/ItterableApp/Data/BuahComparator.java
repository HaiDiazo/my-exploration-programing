/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp.Data;

import java.util.Comparator;

/**
 *
 * @author Mr Nathan
 */
public class BuahComparator implements Comparator<Buah> {

    @Override
    public int compare(Buah o1, Buah o2) {
        return Integer.compare(o2.getCount(), o1.getCount());
    }
    
    
}
