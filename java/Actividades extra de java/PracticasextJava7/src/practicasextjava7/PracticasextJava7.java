/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava7;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                               Scanner impr = new Scanner(System.in);
                               int n;
        do{
         System.out.println("Ingrese la cantidad de personas a evaluar");
         n = impr.nextInt();
        }while (n<0);
       int xd = n;
       int sus = n;
       int max =0;
          while (xd > 0){
          System.out.println("Ingrese el numero");
          int numero = impr.nextInt();
          if (xd == n){
          max = numero;
          }else {
          if (max < numero){
          max =numero;
          }
          
          
          }
          xd--;
          
          

    }
          System.out.println("Maximo"+max);
     
    do{
     System.out.println("Ingrese el numero");
          int numero = impr.nextInt();
          if (xd == n){
          max = numero;
          }else {
          if (max < numero){
          max =numero;
          }
          
          
          }
          sus--;
    }while (sus > 0);
          System.out.println("Maximo"+max);
}
}

