/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.mes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class mesService {
                         private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public void juegomessecreto(){
    mes m = new mes();
        String [] mesarray= {"enero", "febrero", "marzo", "abril", "mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        m.setMese(mesarray);
        Random rn = new Random();
        int a;
        int messect = rn.nextInt(12);
        System.out.println(messect);
        do{
            System.out.println("Ingrese el mes secreto");
            m.setMesing(impr.nextLine());
            if (m.getMesing().equals(m.getMese()[messect])){
                System.out.println("Felicitaciones, acertaste, el mes secreto era "+m.getMese()[messect]);
                a=1;
            }else
            {
                System.out.println("Intenta de nuevo");
                a=0;
            }
        }while(a ==0);

    
    }
}
