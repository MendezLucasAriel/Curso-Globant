/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava11;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        System.out.println("Ingresar el numero");
              int dividendo = impr.nextInt();
              int num =0;
         do{
         dividendo = dividendo/10;
         num++;
         }while (dividendo != 0) ;
         
         System.out.println(num);
    }
    
}
