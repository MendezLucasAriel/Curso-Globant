/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.cancion;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class cancionservice {
         private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public cancion inicializarCancion(){
    cancion c = new cancion("","");
    return c;
    
    }
    public cancion muestraCancion(cancion c){
        System.out.println("Ingrese el nombre de la cancion: ");
        c.setTitulo(impr.nextLine());
        System.out.println("Ingrese el nombre del autor");
        c.setAutor(impr.nextLine());
        return c;
        
    }
}
