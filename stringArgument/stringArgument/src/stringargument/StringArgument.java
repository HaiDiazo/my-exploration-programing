/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringargument;

/**
 *
 * @author Mr Nathan
 */
public class StringArgument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        if (args.length > 0) {
            for(int i = 0 ; i < args.length; i++){
                System.out.println(args[i]);
            }
        }
    }
    
}
