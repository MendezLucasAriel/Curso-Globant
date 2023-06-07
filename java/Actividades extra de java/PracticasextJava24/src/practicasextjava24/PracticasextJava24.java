/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava24;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner impr = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Ingrese n");
        int n = impr.nextInt();
        int [] vector = new int [n];
        for (int i =0;i<n;i++)
        {
            if (i==0){
                vector[i]=0;
            }else 
            {   if (i==1){
                vector[i]=1;
            }else
            {
                 vector[i] = vector[i-1]+vector[i-2];   
                    }
        }
            System.out.print(" "+vector[i]);
        }
    }
    
}
