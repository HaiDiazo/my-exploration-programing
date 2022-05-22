/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp.Data;

/**
 *
 * @author Mr Nathan
 */
public class Buah {
    
    private int count;
    private String namaBuah;
    
    public Buah(int count, String namaBuah) {
        this.count = count;
        this.namaBuah = namaBuah;
    }
    
    public int getCount(){
        return count;
    }
    
    public String getNamaBuah()
    {
        return namaBuah;
    }
}
