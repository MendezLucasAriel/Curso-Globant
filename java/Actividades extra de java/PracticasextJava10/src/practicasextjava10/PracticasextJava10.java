/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasextjava10;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author teenc
 */
public class PracticasextJava10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner impr = new Scanner(System.in);
         Random rand=new Random();
        // TODO code application logic here
        int num =rand.nextInt(11);
        int num2=rand.nextInt(11);
        int result = num*num2;
        //System.out.println(" el resultado es "+result+ "  "+num+ "  "+num2);
        System.out.println("Adivine el resultado de la multiplicacion");
        int adiv = impr.nextInt();
        if (adiv == result){
        System.out.println("Correcto");
        
        }else
            System.out.println("Incorrecto el resultado era "+result);
    }
    
}
