/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasexjavat21;
import java.util.Scanner;
/**
 *
 * @author teenc
 */
public class PracticasexJavat21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner impr = new Scanner(System.in);
        // TODO code application logic here
        double []vectorprom = new double [10];
        int bait;
        int aprobados =0;
        int desaprobados =0;
        for (int i=0;i<10 ;i++)
        {
            for(int j = 0;j<4;j++)
            {
                switch (j){
                    case 0:
                        System.out.println("Ingrese la nota del practico");
                        bait = impr.nextInt();
                        vectorprom[i] = 0;
                        vectorprom[i] = vectorprom[i]+(bait*0.10);
                        
                        break;
                    case 1:
                        System.out.println("Ingrese nota del segundo practico");
                        bait = impr.nextInt();
                        
                        vectorprom[i] = vectorprom[i]+(bait*0.15);
                        break;
                    case 2:
                        System.out.println("Ingrese nota del primer integrador");
                        bait = impr.nextInt();
                        
                        vectorprom[i] = vectorprom[i]+(bait*0.25);
                        break;
                    case 3:
                        System.out.println("Ingrese nota del segundo integrador");
                        bait = impr.nextInt();
                        
                        vectorprom[i] = vectorprom[i]+(bait*0.5);
                        break;
                }
            }
            System.out.println("Vectorprom"+vectorprom[i]);
            if (vectorprom[i] >=7){
            aprobados++;
            }else
                desaprobados++;
        }
        System.out.println("Un total de "+aprobados+ " aprobaron el curso y un total de "+desaprobados+" desaprobaron");
        
        
    }
    
}
