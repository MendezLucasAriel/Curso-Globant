/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.date;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class DateService {
    
         private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public Date crearfecha(){
        date d = new date();
        System.out.println("Dame el año (arranca en 1900)");
        d.setAnio(impr.nextInt()-1900);
        System.out.println("Dame el mes");
        d.setMes(impr.nextInt()-1);
        System.out.println("Dame el dia");
        d.setDia(impr.nextInt());
        Date fecha = new Date(d.getAnio(),d.getMes(),d.getDia());
    return fecha;
    }
}
