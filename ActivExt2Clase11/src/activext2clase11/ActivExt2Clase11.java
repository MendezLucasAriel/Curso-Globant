/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activext2clase11;

import entidad.Pelicula;
import entidad.alquiler;
import java.util.Date;
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
        Date ff = new Date(123,6,10);
        Date fi = new Date();
        
      //  System.out.println((ff.getTime()-fi.getTime())/(24*3600*1000));
      //  long dia =   (ff.getTime()-fi.getTime())/(24*3600*1000);
        AlquilerService sva = new AlquilerService();
        
        PeliculaService svp = new PeliculaService();
        
        Pelicula peli[] = new Pelicula[5];
        for (int i =0; i<5;i++){
        peli[i] = svp.crearPelicula("terminator"+i,"accion",1998+i,90);
        svp.listarPeliculas(peli[i]);
        }
        alquiler alquilere[] = new alquiler[5];
        for (int i =0; i<2;i++){
        alquilere[i] = sva.crearAlquiler("terminator"+i,fi,ff,0);
        
        
        sva.listarAlquiler(alquilere[i]);
        }
        
        for (int i =0; i<5 ;i++){
        if (alquilere[i].getPeliculaAlquilada().compareTo(peli[i].getTitulo())){
        
        }else{
            System.out.println(peli[i].getTitulo());
        }
        
        }
    }
    
}

