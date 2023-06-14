/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author teenc
 */

public class ServicioPersona {
    
            private Scanner impr = new Scanner(System.in).useDelimiter("\n");
            
            public Persona CrearPersona(){
                System.out.println("Carga el nombre");
                String name = impr.nextLine();
                System.out.println("Carga el apellido");
                String surname = impr.nextLine();
                System.out.println("Carga la edad");
                int age = impr.nextInt();
                impr.nextLine();
                return new Persona(name,surname,age);
                
}
            
            
            public void modificarPersonaNombre(Persona nombers)
            {
                
            System.out.println("Carga el nombre");
                
            String name = impr.nextLine();
                
                nombers.setNombre(name);
            }
    
}
