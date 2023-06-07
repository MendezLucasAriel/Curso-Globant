/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava19;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        int [] vector1 = new int[2];
        int [] vector2 = new int[2]; 
        for (int i =0; i<2;i++)
        {
            vector1[i] = impr.nextInt();
            vector2[i] = impr.nextInt();
        }
        for (int i =0; i<2;i++)
        {
            if (vector1[i] != vector2[i]){
                System.out.println("No son iguales");
            break;
            }else
                System.out.println("Son iguales");
        }
     }
    
}
