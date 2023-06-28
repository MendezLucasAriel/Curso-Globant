/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8poo;

import entidad.cadena;
import service.servicio;

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
        servicio sv = new servicio();
        cadena c = sv.CargarCadena();
        
        System.out.println("La frase tiene un total de "+sv.mostrarVocales(c)+" vocales");
        System.out.println("La frase "+c.getFrase()+ " invertida seria "+sv.invertirFrase(c));
        System.out.println("La frase contiene ese caracter un total de "+sv.contabilizarCaracter(c)+" veces");
        sv.compararLong(c);
        sv.concatenar(c);
        sv.reemplazar(c);
        System.out.println("Contiene esa letra?"+sv.contains(c));
        
    }
    
}
