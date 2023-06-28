/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class Servicios {
    private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    public CuentaBancaria CrearCuenta(){
        CuentaBancaria cb = new CuentaBancaria();
        System.out.println("Dame n de cuenta");
        cb.setNcuenta(impr.nextInt());
        System.out.println("Dame DNI");
        cb.setDni(impr.nextLong());
        System.out.println("Dame saldo");
        cb.setSaldo(impr.nextInt());
        return cb;
        
    }
    
    
    public void Ingresar (CuentaBancaria CB){
        System.out.println("Cuanta plata queres meter");
        int saldo  = impr.nextInt();
        
        CB.setSaldo(CB.getSaldo()+ saldo);
     
    }
    
     public void Retiro (CuentaBancaria CB){
        System.out.println("Cuanta plata queres sacar");
        int saldo  = impr.nextInt();
        if (CB.getSaldo() < saldo ){
            System.out.println("Rope");
        }else
           CB.setSaldo(CB.getSaldo()- saldo); 
    }
     
     
     public void RetiroRap (CuentaBancaria CB){
        System.out.println("Cuanta plata queres sacar");
        int saldo  = impr.nextInt();
        if (CB.getSaldo()*0.20 < saldo ){
            System.out.println("No podes retirar mas de el 20% de tu cuenta");
        }else
           CB.setSaldo(CB.getSaldo()- saldo); 
    }
     public void consultarSaldo (CuentaBancaria CB){
       
         System.out.println( "El saldo que te queda es de: "+ CB.getSaldo());
         
    }
     
     public void consultarDatos (CuentaBancaria CB){
       
         System.out.println( CB.toString());
         
    }
    
}
