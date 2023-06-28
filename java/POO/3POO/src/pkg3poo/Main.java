/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3poo;

import Entidad.Operacion;
import Service.Servi;

/**
 *
 * @author teenc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Servi s1 = new Servi();
        Operacion oper =  s1.CrearOperacion();
        //Operacion oper2 = s1.CrearOperacion();
      // int zar = oper.getN2();
       
        System.out.println(s1.Restar(oper.getN1(), oper.getN2()));
        System.out.println(s1.Sumar(oper.getN1(), oper.getN2()));
        System.out.println(s1.Multiplicar(oper.getN1(), oper.getN2()));
        System.out.println(s1.Dividir(oper.getN1(), oper.getN2()));
      //System.out.println(s1.Restar(oper.getN1(), oper.getN2()));
      
      
//s1.Restar(oper.getN1(), oper.getN2());
    }
    
}
