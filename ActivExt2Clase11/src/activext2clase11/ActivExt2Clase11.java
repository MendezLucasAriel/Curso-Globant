/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activext2clase11;

import entidad.Pelicula;
import entidad.alquiler;
import service.AlquilerService;
import service.PeliculaService;

/**
 *
 * @author teenc
 */
public class ActivExt2Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlquilerService sva = new AlquilerService();
        PeliculaService svp = new PeliculaService();
        Pelicula p = svp.crearPelicula();
        alquiler a = sva.crearAlquiler();
        
       
    }
    
}
