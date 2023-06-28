/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Nespresso;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class Servicios {
     private Scanner impr = new Scanner(System.in).useDelimiter("\n");
     
     public  void llenarCafetera(Nespresso np){
         np.setCantidadactual(np.getCapacidadmaxima());
         System.out.println("Llenando...");
     
     
     }
     public void llenarTaza(Nespresso np){
         System.out.println("Cual es el tamaño de la taza en ml?");
         int taza = impr.nextInt();
         int tazacarga;
         double porcentaje;
         System.out.println("Llenando...");
         if (taza>np.getCantidadactual()){
             porcentaje = (np.getCantidadactual()*100)/taza;
         taza = np.getCantidadactual();
         np.setCantidadactual(np.getCantidadactual()- taza);      
             System.out.println("Se vertieron "+taza+ " ml de cafe en la taza lo que equivale a el "+porcentaje+"% de la taza, lamentamos no poder haber llenado su taza");
         }else
         {
             System.out.println("Se lleno su taza de "+taza+ " ml");
             np.setCantidadactual(np.getCantidadactual()-taza);
         }
     
     }
     
     
    public  void vaciarCafetera(Nespresso np){
        
         np.setCantidadactual(0);
         System.out.println("Vaciando...");
    
     }
    
    public  void AgregarCafe(Nespresso np){
         System.out.println("Cuanto cafe desea ingresar a la cafetera?");
         int cafe = impr.nextInt();
         if (np.getCantidadactual()+cafe > np.getCapacidadmaxima()){
             System.out.println("Overflow de cafe");
             np.setCantidadactual(np.getCapacidadmaxima());
         
         }else 
             np.setCantidadactual(np.getCantidadactual()+cafe);
     
    
     }
    
     public void consultarDatos (Nespresso CB){
       
         System.out.println( CB.toString());
         
    }
}
