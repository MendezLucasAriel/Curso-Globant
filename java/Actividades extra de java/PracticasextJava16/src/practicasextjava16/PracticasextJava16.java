/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava16;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner impr = new Scanner(System.in);
                System.out.println("Cuantas personas desea ingresar?");
                int n = impr.nextInt();
                impr.nextLine();
                for (int i =0; i<n;i++)
                {
                System.out.println("Ingrese nombre");
                String nombre = impr.nextLine();
                
                System.out.println("Ingrese edad");
                int edad = impr.nextInt();
                impr.nextLine();
                if(edad>=18){
                System.out.println(nombre+" tiene "+edad+ " por lo tanto es mayor de edad");
                }else
                    System.out.println(nombre+" tiene "+edad+ " por lo tanto es menor de edad");
                System.out.println("Desea seguir ingresando personas?");
                String respuesta = impr.nextLine();
                respuesta = respuesta.toLowerCase();
                if (respuesta.equals("no")){
                break;
                }

                }
                
    }
    
}
