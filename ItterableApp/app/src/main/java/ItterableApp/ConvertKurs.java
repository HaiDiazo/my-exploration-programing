/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItterableApp;

import ItterableApp.Data.Kurs;
import java.util.Scanner;

/**
 *
 * @author Mr Nathan
 */
public class ConvertKurs {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Kurs kurs = new Kurs();
        
        String idKhurs,inputChoice;
        Boolean choice = true;
        int money, conv;
        
        while (choice) {            
            System.out.print("Masukan Perintah: ");
            inputChoice = input.nextLine();

            String[] split = inputChoice.split(" ");

            switch (split[0]) {
                case "KURS":
                    kurs.setKurs(split[1], Integer.parseInt(split[2]));
                    break;
                case "CONV":
                    
                    if (kurs.cekKurs(split[1])) {
                        double angka = Integer.parseInt(split[2]);
                        double nilaiKurs = kurs.getKurs(split[1]);
                        double hasil = angka / nilaiKurs;
                        System.out.println(hasil);
                    }else{
                        System.out.println(split[1] + " " + split[2] + " -> unknown");
                    }
                    break;
                case "SHOWALL":
                    kurs.getAll();
                    break;
                case "HELP":
                    System.out.println("KURS IDR 4000 -> Melakukan Input Kurs");
                    System.out.println("CONV IDR 4000 -> Melakukan Convert Kurs");
                    break;
                case "EXIT":
                    choice = false;
                    break;
                default:
                    System.out.println("Command Not Found!");
                    choice = true;
                    break;
            }

            inputChoice = "";
        
        }
        
    }
}
