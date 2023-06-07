/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava15;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
        Scanner impr = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese la operacion que desea hacer (suma, resta, multiplicacion y division)");
        palabra = impr.nextLine();
        
        
        System.out.println("Ingrese un numero");
        int num = impr.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = impr.nextInt();
        
        palabra = palabra.toLowerCase();
        switch (palabra)
        {
            case "suma":
                suma(num,num2);
                break;
            case "resta":
                resta(num,num2);
                break;
            case "multiplicacion":
                multiplicacion(num,num2);

                break;
            case "division":
                division(num,num2);

                break;
            
            default:
                System.out.println("Rope it nyagger");
        }
    }
    
    static void suma (int n1,int n2){
    int result = n1 + n2;
    System.out.println("Resultado "+result);
    }
    
    static void resta (int n1,int n2){
    int result = n1 - n2;
    System.out.println("Resultado "+result);
    }
    
    static void multiplicacion (int n1,int n2){
    int result = n1 * n2;
    System.out.println("Resultado "+result);
    }
    
    static void division (int n1,int n2){
    double result = n1 / n2;
    System.out.println("Resultado "+result);
    }
    
    
    
}
