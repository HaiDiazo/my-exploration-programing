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
public class PersonComparator implements Comparator<Person>{
    
    @Override
    public int compare(Person o1, Person o2)
    {
        return o1.getNama().compareTo(o2.getNama());
    }
}
