/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10poo;

import entidad.numeros;
import java.lang.reflect.Array;
import java.util.Arrays;
import service.numerosservice;

/**
 *
 * @author teenc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        numerosservice sv = new numerosservice();
        numeros n = sv.creararray1();
        double [] a = new double[50];
        double [] b = new double[20];
        System.out.println(Arrays.toString(n.getMiArray()));
        numeros nt = sv.creararray2();
       // System.out.println(Arrays.toString(nt.getMiArray()));
        sv.ordenararray(n);
        sv.set(nt,n);
        System.out.println(Arrays.toString(nt.getMiArray()));
       
        System.out.println(Arrays.toString(n.getMiArray()));
        




















// TODO code application logic here
       // numerosservice sv = new numerosservice();
      //  numeros n = sv.creararray1();
        //System.out.println(Array.toString(n));
        
    // numeros miObjetoArray = new numeros(50);
    // for (int i =0;i<50; i++){
   //  miObjetoArray.miArray[i] = Math.random()*10;
    //     System.out.println(miObjetoArray.miArray[i]);
    //     System.out.println("-------------------------------------------------");
   //  Arrays.sort(miObjetoArray.miArray);
  //   }
    // Array.toSting(miObjetoArray)
        //System.out.println(Array.toString(miObjetoArray.miArray));
    }
    
}
