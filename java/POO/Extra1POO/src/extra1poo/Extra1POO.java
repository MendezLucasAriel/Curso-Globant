/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1poo;

import entidad.cancion;
import service.cancionservice;

/**
 *
 * @author teenc
 */
public class Extra1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cancionservice sv = new cancionservice();
        cancion c = sv.inicializarCancion();
        sv.muestraCancion(c);
        System.out.println(c.toString());
    }
    
}
