/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrraynama;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Mr Nathan
 */
public class ArrayListPush {

    /**
     * @param args the command line arguments
     */
    public static String[] pushArr(int n, String[] arr, String val)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        for(String a: arr)
            arrayList.add(a);
        
        arrayList.add(val);
        
        arr = arrayList.toArray(arr);
        
        return arr;
    }
    
    public static String[] pullArr(int n, String[] arr)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        
        for(String a: arr)
            arrayList.add(a);
        
        arrayList.remove(n-1);
        
        
        String[] newArr = new String[arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++)
            newArr[i] = arrayList.get(i);
        
        return newArr;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] nama = {"Nathan", "Aptanta", "Parama"};
        String push;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(Arrays.toString(nama));
        
        System.out.print("Silahkan masukan nama: ");
        push = input.nextLine();
        
        nama = pushArr(nama.length, nama, push);
        
        System.out.println(Arrays.toString(nama));
        
        System.out.println("Pull Array? ");
        System.out.print("Answer: ");
        String choice = input.nextLine();
        
        switch(choice)
        {
            case "yes":
                
                System.out.println(Arrays.toString(pullArr(nama.length, nama)));
                break;
            case "no":
                System.out.println("Terimakasih!");
                break;
            default:
                System.out.println("Tidak ada pilihan yang diketik");
                break;
        }
        
    }
    
}
