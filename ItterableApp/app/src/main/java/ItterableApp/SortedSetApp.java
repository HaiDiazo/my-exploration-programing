/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import ItterableApp.Data.Person;
import ItterableApp.Data.PersonComparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Mr Nathan
 */
public class SortedSetApp {
     public static void main(String[] args){
         
         SortedSet<Person> people = new TreeSet<>(new PersonComparator());
         
         people.add(new Person("Nathan")); 
         people.add(new Person("Alan"));
         people.add(new Person("Joko"));
         
         for (var person : people)
             System.out.println(person.getNama());
     }
}
