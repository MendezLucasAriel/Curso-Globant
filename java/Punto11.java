/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto12;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class Punto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        Scanner impr = new Scanner(System.in);
                        System.out.println("Ingrese una frase");
                           String frase = impr.nextLine();
                          /*
                           char array[] = frase.toCharArray();
                        
                           for(int i =0; i < frase.length() ;i++){
                           
                               switch (array[i]){
                               
                               case'a':
                                    array[i]= '@';
                               break;
                               case'e':
                                    array[i]= '#';
                               break;
                               case'i':
                                    array[i]= '$';   
                               break;
                               case'o':
                                   array[i]= '%';  
                               break;
                               case'u':
                                     array[i]= '*';  
                               break;
                               
                           }
                           }
                           
              frase = String.valueOf(array);
*/          
             String retorno = concatenar(frase);
             
              System.out.println(frase);
              System.out.println(retorno);

    }
    public static String   concatenar(String frase){
    
        char array[] = frase.toCharArray();
                           
                           for(int i =0; i < frase.length() ;i++){
                           
                               switch (array[i]){
                               
                               case'a':
                                    array[i]= '@';
                               break;
                               case'e':
                                    array[i]= '#';
                               break;
                               case'i':
                                    array[i]= '$';   
                               break;
                               case'o':
                                   array[i]= '%';  
                               break;
                               case'u':
                                     array[i]= '*';  
                               break;
                               
                           }
                           }
              frase = String.valueOf(array);
        return frase;
    }
            
}

