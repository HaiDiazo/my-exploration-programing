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
public class StringArgument2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Membuat command line sendiri

        if (args.length > 0) {
            switch(args[0]){
                case "help":
                    System.out.println("Donat version \t\t untuk mengecek version");
                    System.out.println("Donat help \t\t untuk menampilkan bantuan");
                    System.out.println("Donat hello \t\t untuk menampilkan pesan Hello World");
                    System.out.println("Donat hello [nama] \t untuk menampilkan pesan Hello [nama]");
                    break;
                case "version":
                    System.out.println("Version 0.1");
                    break;
                case "hello":
                    if (args.length > 1) {
                        System.out.println("Hello " + args[1]);
                    }else {
                        System.out.println("Hello");
                    }
                    break;
                default:
                    System.out.println("Argumen tidak dikenali, silahkan ketik StringArgument2 help");
                    break;
            }
        }else{
            System.out.println("Tidak ada Argumen Yang diinputkan");
        }
    }
    
}
