/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaextjava8;

import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class PracticaextJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner impr = new Scanner(System.in);
       int cont =0;
       int contpar =0;
       int contimpar=0;
       int num;
        do{
        do{
        System.out.println("Ingresa num");
         num = impr.nextInt();
        }while (num<1);
        if (num%5 == 0){
        break;
        }else{
        cont++;
        if( num%2 == 0 ){
        contpar++;
        }else{
        contimpar++;
        }
        }
        }while (num != -1);
        System.out.println("Total de numeros recorridos "+cont+" numeros pares recorrido "+contpar+" numeros impares recorridos"+contimpar);
    }
    
}
