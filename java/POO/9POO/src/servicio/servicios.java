/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Matematicas;

/**
 *
 * @author teenc
 */
public class servicios {
    public static double devolverMayor(Matematicas m){
        return Math.max(m.getN1(), m.getN2());
    }

    public static double devolverMenor(Matematicas m){
        return Math.min(m.getN1(), m.getN2());
    }


    public static double calcularPotencia(Matematicas m){
     
    
    int mayor= (int) devolverMayor(m) ;
    int menor = (int) devolverMenor(m);
    return Math.pow(mayor, menor);
    
    }
    
    
    public static double calcularRaiz(Matematicas m){
    return Math.sqrt(Math.abs(devolverMenor(m)));
    }
}
