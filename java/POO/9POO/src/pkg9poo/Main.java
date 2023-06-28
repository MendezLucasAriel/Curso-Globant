/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9poo;

import entidad.Matematicas;
import servicio.servicios;

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
        Matematicas m = new Matematicas ();
        System.out.println("N1= "+m.getN1());
        System.out.println("N2= "+m.getN2());
        System.out.println("La potencia entre 2 numeros random es "+servicios.calcularPotencia(m)); 
        System.out.println("La raiz cuadrada del menor es "+servicios.calcularRaiz(m));
        System.out.println("El mayor es "+servicios.devolverMayor(m));
    }
    
}
