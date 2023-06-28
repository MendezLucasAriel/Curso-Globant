/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1pooreborn;

import Entidad.Libro;
import Servicios.LibroServicio;

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
        
        LibroServicio cd = new LibroServicio();
        Libro l = cd.cargarDatos();
        cd.mostrarLibro(l);
        System.out.println(l.toString());
    }
    
}
