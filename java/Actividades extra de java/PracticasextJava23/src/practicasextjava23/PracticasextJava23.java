/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava23;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author teenc
 */
public class PracticasextJava23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        Random r = new Random();
        String [][] matriz = new String[20][20];
        String palabra;
        int j;
        
        for (int i=0;i<20;i++)
        {
            for (int x=0;x<20;x++)
            {
                matriz [i][x] = "";
            }
        }
        
        for (int i=0;i<5;i++)
        {
            do{
            System.out.println("dame palabra");
            palabra = impr.nextLine();
            //impr.nextLine();
            }while (palabra.length()<3 || palabra.length()>5);
            j= palabra.length();
            matriz [0][0] = palabra.substring(1,2);
           // System.out.println(matriz[0][0]);
           int m;
           int l;
           l = r.nextInt(15);
                m = r.nextInt(20);
            for (int k = 0;k<j;k++)
            {
             
                
                
                matriz[m][l]= palabra.substring(k,k+1);
                //System.out.println(matriz[m][l]+" "+m);
                l++;
            }
        }
        
        for (int i=0;i<20;i++)
        {
            for (int x=0;x<20;x++)
            {
                if (matriz[i][x].equals(""))
                {
                int xd = r.nextInt(10);
                    
                 matriz[i][x] = String.valueOf(xd);
                }
            }
        }
        
        for (int i=0;i<20;i++)
        {
            for (int x=0;x<20;x++)
            {
               System.out.print(matriz[i][x]+" ");
                
            }
            System.out.println("");
        }
        
    }
    
}
