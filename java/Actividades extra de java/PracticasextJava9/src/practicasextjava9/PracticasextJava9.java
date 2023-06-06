    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava9;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner impr = new Scanner(System.in);
       int cociente=0;
       int dividendo;
       int divisor;
       System.out.println("Ingresar el dividende");
               dividendo = impr.nextInt();
       System.out.println("Ingresar el divisor");
               divisor = impr.nextInt();       
        while (dividendo > divisor){
        dividendo = dividendo - divisor;
        cociente++;
                }
        System.out.println("Cociente "+cociente+" resto "+dividendo);
    }
    
}
