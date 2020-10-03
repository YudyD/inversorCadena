/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversorCadena;

import java.util.Scanner;
/**
 *
 * @author yudy-
 */
public class inversorCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("Digite la cadena");
        String str = new Scanner(System.in).nextLine();
        sarta(str);
        System.out.println("");
    }
    public static boolean sarta(String str){
        if (str.equals("")){
            return true;
        }else{
            for (int i = str.length; i > 0; i--){
                System.out.println("\033[31m" + str.substring(i-1, i) + "\033[30m");
            }
        }
        return false;
    }
    
}
