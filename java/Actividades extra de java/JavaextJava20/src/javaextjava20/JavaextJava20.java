/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextjava20;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class JavaextJava20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner impr = new Scanner(System.in);
        int [] vector = new int[5];
        
    llenar(vector);
    }
    
    static void llenar (int [] array){
    for (int i=0;i<5;i++){
    Random r = new Random();
    array [i] = r.nextInt(21); 
    
    }
    mostrar(array);

    
    
    
    }
    
    static void mostrar (int []array){
    for (int i=0;i<5;i++){
    System.out.println(array[i]);
    
    
    }
    }
}
