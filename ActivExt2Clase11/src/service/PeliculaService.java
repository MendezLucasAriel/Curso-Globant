/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Pelicula;

/**
 *
 * @author teenc
 */
public class PeliculaService {
    
    public Pelicula crearPelicula(String titulo, String genero, int anio, int duracion){
    Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
    return pelicula;
    }
    
   
    
    public void listarPeliculas(Pelicula p) {
        System.out.println(p.toString());
    }
    
    public boolean buscarTitulo(){
    
    return true;
    }
    
    public boolean buscarGenero(){
    return true;
    }
    
    
    
    
}
