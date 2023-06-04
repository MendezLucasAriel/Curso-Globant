/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
                Scanner impr = new Scanner(System.in);
                int num;
                int cont = 20;
                do{
                System.out.println("Ingrese un numero");
                num = impr.nextInt();
                cont = --cont;
                //  System.out.println(cont);

                } while (num != 0  && cont != 0);
                
                if (num == 0) {
                System.out.println("Termino porque puso 0"); 
                }else {
                    System.out.println("Ingreso mas de 20 numeros");
                }
                        
                
    }
    
}
