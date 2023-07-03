/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author teenc
 */
public class Pelicula {
     private String titulo;
    private String genero;
    private int anio;
    //int para poder pedir en minutos
    private int duración;   

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duración) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duraci\u00f3n=" + duración + '}';
    }
    
    
    
}
