/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4poo;

import Entidad.Rectangulo;
import Service.ServicioRectangulo;

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
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo rec = sr.CargarDatos();
        System.out.println(sr.Peri(rec.getBase(), rec.getAltura()));
        System.out.println(sr.Super(rec.getBase(), rec.getAltura()));
    }
    
}
