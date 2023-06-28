/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class Servi {
     private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    public Operacion CrearOperacion(){
        Operacion op = new Operacion();
        System.out.println("Ingrese n1");
        op.setN1(impr.nextInt());
        System.out.println("Ingrese N2");
        op.setN2(impr.nextInt());
        return op;
    }
    
    public int Restar(int n1, int n2){
     
    return n1-n2;
     
    }
    public int Sumar (int n1, int n2){
     
    return n1+n2;
     
    }
    
     public int Multiplicar (int n1, int n2){
     if (n1 != 0 && n2 !=0 ){
    return n1*n2;
     }else{
         System.out.println("Filho da puta");}
             return 0;
    }
     
      public int Dividir (int n1, int n2){
   if (n1 != 0 && n2 !=0 ){
    return n1/n2;
     }{
         System.out.println("Filho da puta");
             return 0;    
      }
      }
    
}
