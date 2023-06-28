/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author teenc
 */
public class Libro {
    private String autor;
    private String titulo;
    private int ISBN;
    private int npag;

    public Libro() {
    }

    public Libro(String autor, String titulo, int ISBN, int npag) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.npag = npag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Libro" + "autor=" + autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", npag=" + npag + '}';
    }
    
    
    
    
    
}
