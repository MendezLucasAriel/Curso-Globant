/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.nif;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class nifservice {
                     private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public nif ingresarDNI(){
        nif n = new nif();
        String [] posnif= {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K","E"};
        System.out.println("Ingrese el dni");
        n.setDni(impr.nextLong());
        int divnif = (int) (n.getDni()%23);
        n.setLetra(posnif[divnif]);
        return n;
    }
    
    public void mostrar(nif n){
        String dni = Long.toString(n.getDni());
        dni = dni.substring(0,7);
        System.out.println(dni+"-"+n.getLetra());
    
    }
    
}
