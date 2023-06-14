/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Persona;
import java.util.Scanner;
import servicios.ServicioPersona;

/**
 *
 * @author teenc
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner impr = new Scanner(System.in);
     
        
        ServicioPersona sp1 = new ServicioPersona();
        
        Persona p1 = sp1.CrearPersona();
        
        System.out.println(p1.nombre+p1.getApellido()+p1.getEdad());
        
     //   p1 = sp1.modificarPersonaNombre(p1);
        sp1.modificarPersonaNombre(p1);
       // System.out.println(p1.nombre+" aaaaaaaaaaa");
        System.out.println(p1.nombre+p1.getApellido()+p1.getEdad());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Persona p1 = new Persona(name);
//        Persona p1 = new Persona();
//        p1.setApellido("Mendez");
//        p1.setEdad(5);
//        System.out.println(p1.nombre+ p1.getApellido().toLowerCase() +p1.getEdad());
//         String name = p1.getApellido().toUpperCase();
//         p1.setApellido(name);
//        int num = p1.getEdad()*2;
        
//        p1.setEdad(num);
//       
//                System.out.println(p1.nombre+ p1.getApellido() +p1.getEdad());
//                
//               Persona p2= new Persona();
//               System.out.println(p1.getEdad()+ "  "+ p2.getEdad());
//               p2.setEdad(17);
//               System.out.println(p1.getEdad()+ "  "+ p2.getEdad());
        // TODO code application logic here
    }
    
}
