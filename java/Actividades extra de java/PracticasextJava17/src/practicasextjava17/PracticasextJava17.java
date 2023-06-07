/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava17;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = impr.nextInt();
        if (sexo (numero)== true)
        {
            System.out.println("No es primo");
        }else 
            System.out.println("Si es primo");
       
    }
    static boolean sexo(int n1){
    boolean amongus = false;
    int result;
    int acum=0;
    result = n1/2;
    for (int i=1;i<result;i++){
        
    if (n1 % i == 0){
    acum++;
    }
    if (acum==2){
        amongus = true;
    break;
    }
    }
    return amongus;
    }
    
}
