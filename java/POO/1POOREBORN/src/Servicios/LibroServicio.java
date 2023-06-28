/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class LibroServicio {
    
        private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarDatos(){
    Libro l1 = new Libro();
    System.out.println("Dame el nombre del libro");
        l1.setTitulo(impr.nextLine());
        System.out.println("Dame el autor del libro");
        l1.setAutor(impr.nextLine());
        //impr.nextLine();
        System.out.println("Dame el codigo ISBN");
        l1.setISBN(impr.nextInt());
        System.out.println("Dame el numero de paginas");
        l1.setNpag(impr.nextInt());
       return l1;
      
    
    }
    
    
    public void mostrarLibro(Libro l1){
        System.out.println("Titulo"+l1.getTitulo());
        System.out.println("Autor"+l1.getAutor());
        System.out.println("ISBN"+l1.getISBN());
        System.out.println("Npag"+l1.getNpag());
        
        //System.out.println("Tostring; "+l1.toString());
    }
    
}
