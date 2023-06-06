/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaextjava2;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticaextJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner impr = new Scanner(System.in);
                int a=1;
                int b=2;
                int c=3;
                int d=4;
                int aux;
                aux = b;
                b = c;
                c =a;
                a = d;
                d= aux;
                System.out.println("A"+a+ "  B"+b+"   C"+c+"  D"+d);

    }
    
}
