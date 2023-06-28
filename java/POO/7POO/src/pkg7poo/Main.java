/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7poo;

import Entidad.Persona;
import Servicios.service;

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
        
        service sv = new service();
        Persona personas[] = new Persona[4];
        
       
        for(int i = 0; i < 4 ; i++) {
            personas[i] = sv.crearPersona();
        }

        for(int i = 0; i < personas.length; i++) {

            switch (sv.calcularIMC(personas[i])) {
                case -1:
                    System.out.println("Debajo de peso ideal");
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    break;
                case 1:
                    System.out.println("Sobrepeso");
                    break;
                default:
                    System.out.println("Error en calculo.");
                    break;
            }
        }

        for(int i = 0; i < personas.length; i++) {
            sv.esMayorDeEdad(personas[i]);
        }
        
    }
    
}
