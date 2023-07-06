/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class puntosService {
             private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPuntos(){
        Puntos p = new Puntos();
        System.out.println("Ingrese el valor en Y del primer punto ");
        p.setY1(impr.nextInt());
        System.out.println("Ingrese el valor en X del primer punto ");
        p.setX1(impr.nextInt());
        System.out.println("Ingrese el valor en Y del segundo punto ");
        p.setY2(impr.nextInt());
        System.out.println("Ingrese el valor en X del segundo punto ");
        p.setX2(impr.nextInt());
        return p;
    }
    public double calcularDistancia(Puntos p){
    
    double distancia = Math.sqrt(Math.pow((p.getX2()-p.getX1()),2)+Math.pow((p.getY2()-p.getY1()), 2));
        System.out.println("Distancia"+distancia);
        return distancia;
    }
}

