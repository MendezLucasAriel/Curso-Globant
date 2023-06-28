/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.numeros;
import java.util.Arrays;

/**
 *
 * @author teenc
 */
public class numerosservice {
    public numeros creararray1(){
    numeros n = new numeros();
    double [] num = new double [50];
    
    for(int i=0;i<50;i++){
        num[i] = Math.random()*10;
       

    }
    n.setMiArray(num);
    
    //    System.out.println(Arrays.toString(n.getMiArray()));
    return n;
    }
    public numeros creararray2(){
        numeros n = new numeros();
    double [] num = new double [20];
    
    for(int i=0;i<20;i++){
        num[i] = Math.random()*10;
       

    }
    n.setMiArray(num);
    
       // System.out.println(Arrays.toString(n.getMiArray()));
        Arrays.fill(num, 0,10,0);
    Arrays.fill(num, 10,20,0.5);  
     n.setMiArray(num);
   // System.out.println(Arrays.toString(n.getMiArray()));
    return n;

    
    }
    
    public numeros set(numeros n, numeros n2){
    double [] num = new double [20];
    double [] num2 = new double [50];
    num2 = n2.getMiArray();
    num = n.getMiArray();
    for (int i =0;i<10;i++){
    Arrays.fill(num, i, i+1,num2[i]);
    
    }
  //  Arrays.fill(num, 0,10,0);
   // Arrays.fill(num, 10,20,0.5);        
    /*for(int i =0;i<20;i++){
    if (i<10){
    num[i] =0;
    
    }else{
    num[i]=0.5;
    }
    
  
}
*/
    n.setMiArray(num);
        //System.out.println(Arrays.toString(n.getMiArray()));
        return n;
    }
    
    public numeros ordenararray(numeros n){
    double [] num = new double [50];
    num = n.getMiArray();
    Arrays.sort(num);
        //System.out.println(Arrays.toString(num));
        n.setMiArray(num);
        return n;
    }
    /*
    public numeros cortarArray (numeros n, numeros n2){
    double [] num = new double [10];
    num=n.getMiArray();
    System.out.println(Arrays.toString(num));
    }
*/
}
