/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterable;

import java.util.List;
/**
 *
 * @author Mr Nathan
 */
public class Iterable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Iterable<String> names = List.of("Eko", "Kurniawan", "Khannedy");
        
        for (String name : names)
            System.out.println(name);
    }
    
}
