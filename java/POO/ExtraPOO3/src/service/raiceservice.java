/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.raices;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class raiceservice {
                 private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    
    public double getDiscriminante(raices r){
    double discriminante = (Math.pow(r.getB(), 2))-4*r.getA()*r.getC();
    return discriminante;
    }
    
    public boolean tieneRaices(double discriminante){
        if(discriminante > 0){
            return true;
        }
        else{
            System.out.println("No posee 2 raices");
            return false;
        }
    }
    
    public boolean tieneRaiz(double discriminante){
        if(discriminante == 0){
            return true;
        }
        else{
            System.out.println("No posee raiz unica");
            return false;
        }
    }
    
    public void obtenerRaices(raices r){
    double discriminante = getDiscriminante(r);
    double r1;
    double r2;
    double r3;
    if (tieneRaices(discriminante)){
    r1 = ((-r.getB())+Math.sqrt(discriminante))/(2*r.getA());
    r2 = ((-r.getB())-Math.sqrt(discriminante))/(2*r.getA());
        System.out.println("Las raices son: "+r1+" y "+r2);
    }
       
    
    }
    public void obtenerRaiz(raices r){
    double discriminante = getDiscriminante(r);
        double r3;
         if (tieneRaiz(discriminante)){
        r3 = ((-r.getB())+Math.sqrt(discriminante))/(2*r.getA());
            System.out.println("La raiz unica es: "+r3);
    }
    }
    public void calcular (raices r){
    obtenerRaices(r);
    obtenerRaiz(r);
    
    }
    
}
