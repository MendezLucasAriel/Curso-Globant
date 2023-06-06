/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava5;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double importe;
        // TODO code application logic here
               Scanner impr = new Scanner(System.in);
               boolean fake;
               do{
                fake = true;
               System.out.println("Ingrese el tipo de usuario");
               String user = impr.nextLine();
               user = user.toUpperCase();
               System.out.println("Ingrese el importe");
                importe = impr.nextInt();
      switch(user){
          case "A":
              importe = importe*0.5;
              break;
          case "B":
              importe = importe*0.65;
              break;
          case "C":
              break;
          default:
              fake = false;
             
      
      }
               }while (fake == false);
      System.out.println("El socio debera pagar "+importe);
    }
    
}
