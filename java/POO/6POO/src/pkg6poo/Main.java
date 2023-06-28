/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6poo;

import Entidad.Nespresso;
import Servicio.Servicios;

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
        
        Servicios sv = new Servicios();
        Nespresso np = new Nespresso(5000, 1250);
        sv.consultarDatos(np);
        sv.llenarTaza(np);
        sv.consultarDatos(np);
        sv.llenarTaza(np);
        sv.AgregarCafe(np);
        sv.consultarDatos(np);
        sv.vaciarCafetera(np);
        sv.consultarDatos(np);
        sv.llenarCafetera(np);
        sv.consultarDatos(np);
    }
    
}
