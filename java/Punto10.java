/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg10;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner impr = new Scanner(System.in);
                    int num = 5;
                    String asterisco;
                    int numero;
                    while (num != 0) {
                        asterisco="";
                        System.out.println("Ingrese un numero");
                         numero = impr.nextInt() ;
                         if (numero <= 0 || numero >20)
                             continue;
                         
                    for (int i = 0 ; i<numero ;i++){
                    asterisco=asterisco+"*";
                    }
                    System.out.println(asterisco);
                    num = --num;
                            }
    }
    
}
