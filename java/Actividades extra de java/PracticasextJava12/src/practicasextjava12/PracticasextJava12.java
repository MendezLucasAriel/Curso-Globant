/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava12;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
        String ii;
        String jj;
        String kk;
        for(int i=0;i<=9;i++)
        {
            for (int j=0;j<=9;j++)
            {
                for (int k=0;k<=9;k++)
                {
                    ii= String.valueOf(i);
                    jj= String.valueOf(j);
                    kk = String.valueOf(k);
                    if (kk.equals("3")){
                    kk = "E";
                    }
                   if (jj.equals("3")){
                    jj = "E";
                    }
                   if (ii.equals("3")){
                    ii = "E";
                    }
                System.out.println(ii+"-"+jj+"-"+kk);
                }
                
            }
        
        
        
        
        }
    }
    
}
