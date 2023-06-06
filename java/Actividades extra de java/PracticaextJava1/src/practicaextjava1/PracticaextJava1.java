/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaextjava1;
import java.util.Scanner;
/**
 *
 * @author teenc
 */
public class PracticaextJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner impr = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Ingrese cantidad de minutos");
        int minutos = impr.nextInt();
        int minutosog = minutos;
        int dias=0;
        int horas=0;
        while (minutos >= 1440){
         minutos = minutos - 1440;
              dias =dias+1;
             
        }
           while(minutos >= 60){
              
         minutos = minutos - 60;
               horas = horas+1;
                ;     
                
    }
           System.out.println("Dias "+dias+" horas "+horas);
    
}
}