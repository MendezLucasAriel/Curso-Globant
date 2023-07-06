/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4poo;

import entidad.nif;
import service.nifservice;

/**
 *
 * @author teenc
 */
public class Extra4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nifservice sv = new nifservice();
        nif n = sv.ingresarDNI();
        sv.mostrar(n);
    }
    
}
