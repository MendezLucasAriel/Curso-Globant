/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2poo;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

/**
 *
 * @author teenc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia c1 = new Circunferencia();
        
        ServicioCircunferencia sc1 =    new ServicioCircunferencia();
        c1.setRadio(198);
        
        sc1.Area(c1.getRadio());
        sc1.Peri(c1.getRadio());
        
        

        
  
  
        
    }
    
}
