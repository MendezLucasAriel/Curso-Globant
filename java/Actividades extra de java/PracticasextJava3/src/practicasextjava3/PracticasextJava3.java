/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava3;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        Scanner impr = new Scanner(System.in);
                        System.out.println("Ingrese numero gil");
                        String letra = impr.nextLine();
                        letra =     letra.toUpperCase();
                        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U"))
                                {
                                    System.out.println("Es vocal");
                                  
                                }
    }
    
}
