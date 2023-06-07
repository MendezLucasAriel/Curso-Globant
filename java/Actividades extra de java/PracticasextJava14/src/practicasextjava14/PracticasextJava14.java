/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava14;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner impr = new Scanner(System.in);

        // TODO code application logic here
        System.out.println("Ingrese cant familias");
        int n = impr.nextInt();
         System.out.println("Ingrese cant hijos");
        int m = impr.nextInt();
        int [] familia;
        int hijos ;
        
        int promedio =0;
        for (int i=0;i<n;i++)
        {
            for (int j =0;j<m;j++)
            {
            
            System.out.println("Ingrese edad hijos");
             hijos = impr.nextInt();
            promedio = promedio+hijos;
            }
        }
        
      
        promedio = promedio / (n*m);
        System.out.println("Promedio familias "+promedio);
    }
    
}
