/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto12t;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class Punto12t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner impr = new Scanner(System.in);

        // TODO code application logic here
        System.out.println("Ingrese un numero");
        int num1 = impr.nextInt();
         System.out.println("Ingrese otro numero");
        int num2 = impr.nextInt();
        esmultiplo(num1,num2);
        
    }
    
    public static void esmultiplo (int num1, int num2)
    {
    float modulo = num1 % num2;
            if (modulo == 0)
                System.out.println(num1+ " es divisible por "+ num2);
            else 
                System.out.println(num1+ " no es divisible por "+num2);
            
    
    }
    
}
