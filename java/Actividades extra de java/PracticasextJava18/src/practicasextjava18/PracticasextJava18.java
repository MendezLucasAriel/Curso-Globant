/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava18;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        System.out.println("Ingrese tamaño vector");
        int n = impr.nextInt();
        int[] vector = new int [n];
        int suma =0;
        for (int i =0; i<n;i++)           
        {
            System.out.println("Ingrese valor");
         vector[i] = impr.nextInt();
         suma = suma+ vector[i];
        }
        System.out.println("Result "+suma);
    }
    
}
