/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr Nathan
 */
public class Person {
    
    private String nama;
    private List<String> hobbies;
    
    public Person(String nama)
    {
        this.nama = nama;
        this.hobbies = new ArrayList<>();
    }
    
    public void addHobby(String newHobbies)
    {
        hobbies.add(newHobbies);
    }
    
    public List<String> getHobbies()
    {
        return hobbies;
    }
    
    public String getNama()
    {
        return nama;
    }
}
