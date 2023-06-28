/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5poo;

import Entidad.CuentaBancaria;
import Service.Servicios;

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
        Servicios sv =  new Servicios();
        CuentaBancaria CB = sv.CrearCuenta();
        
        sv.Ingresar(CB);
        sv.consultarSaldo(CB);
        sv.Retiro(CB);
        sv.consultarSaldo(CB);
        sv.RetiroRap(CB);
        sv.consultarSaldo(CB);
        // CB.setSaldo(sv.Ingresar(CB.getSaldo()));
        
        sv.consultarDatos(CB);
        //System.out.println(CB.toString());
    }
    
}
