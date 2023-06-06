/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaextjava13;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticaextJava13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        System.out.println("Ingresar altura de la escalera");
              int altura = impr.nextInt();
              String og ="";
              for(int i =1;i<altura+1;i++)
              {
                  og = og+i;
                  System.out.println(og);
              }
    }
    
}
