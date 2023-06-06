/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava6;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticasextJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                       Scanner impr = new Scanner(System.in);

        // TODO code application logic here
        System.out.println("Ingrese la cantidad de personas a evaluar");
        int nper = impr.nextInt();
        float altura;
        int enanometro =0;
        double promedioenano=0;
        double promedio=0;
        for (int i=0;i<nper;i++){
        System.out.println("Ingrese la altura de la persona en metros");
        altura = impr.nextFloat();
        if (altura<1.60){
        enanometro++;
        promedioenano = promedioenano+altura;
        promedio= promedio+altura;
        }else{
        promedio = promedio+altura;
        } 
        
        }
        System.out.println(promedio);
        System.out.println(nper);

        promedio = promedio/nper;
        promedioenano =promedioenano/enanometro;
        System.out.println("Promedio normal "+promedio+" promedioenanos "+promedioenano+" cantidad de enanos "+enanometro);
        
    }
    
}
