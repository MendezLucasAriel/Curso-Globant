/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11poo;

import java.util.Date;
import service.DateService;

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
        int agediff;
        int monthdiff;
        int daydiff;
        DateService sv = new DateService();
        Date fecha = sv.crearfecha();
        System.out.println(fecha);
        Date fecha2 = new Date();
        System.out.println(fecha2);
        System.out.println(fecha.compareTo(fecha2));
        System.out.println(fecha.compareTo(fecha));
       agediff = fecha.getYear() - fecha2.getYear();
       monthdiff = fecha.getMonth()-fecha2.getMonth();
       daydiff = fecha.getDate()-fecha2.getDate();
        System.out.println("Entre las 2 fechas hay una diferencia de "+agediff+" años, "+monthdiff+" meses y "+daydiff+" dias");
}        
    }
    

