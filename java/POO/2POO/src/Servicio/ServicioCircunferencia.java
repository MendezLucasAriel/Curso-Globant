/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class ServicioCircunferencia {
      private Scanner impr = new Scanner(System.in).useDelimiter("\n");
      
    public void  Area(double radio){
        
    double a = Math.PI * Math.pow(radio,2);
    System.out.println("El area es"+ a);
    
    }
    
    
    public void Peri(double radio){
 
    double a = 2*Math.PI * radio;
    System.out.println("El area es"+ a);
    }
    

}
