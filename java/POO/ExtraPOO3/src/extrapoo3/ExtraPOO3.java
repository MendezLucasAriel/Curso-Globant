/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapoo3;

import entidad.raices;
import service.raiceservice;

/**
 *
 * @author teenc
 */
public class ExtraPOO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        raices r = new raices (2,9,10);
        raiceservice sv = new raiceservice();
       sv.calcular(r);
    }
    
}
