/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava22;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author teenc
 */
public class PracticasextJava22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Ingrese cuantas filas quiere en la matriz");
        int n = impr.nextInt();
        System.out.println("Ingrese cuantas columnas quiere en la matriz");
        int m = impr.nextInt();
        int [][] matriz = new int [n][m];
        int suma =0;
        for(int i =0;i<n;i++)
        {
            for (int j =0;j<m;j++)
            {
                matriz[i][j] = r.nextInt(11);
                suma = suma+ matriz[i][j];
            }
        }
        System.out.println("Suma = "+suma);
    }
    
}
