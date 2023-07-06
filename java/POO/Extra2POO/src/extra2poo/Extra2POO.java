/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2poo;

import entidad.Puntos;
import service.puntosService;

/**
 *
 * @author teenc
 */
public class Extra2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        puntosService sv = new puntosService();
        Puntos p = sv.crearPuntos();
        System.out.println("Hay una distancia de : "+sv.calcularDistancia(p)+" entre los 2 puntos");
        
    }
    
}
