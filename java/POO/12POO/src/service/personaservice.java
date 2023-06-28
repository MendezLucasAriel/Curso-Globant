/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class personaservice {
      private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    public persona crearpersona(){
    persona p = new persona();
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(impr.nextLine());
        System.out.println("Ingrese el año en que nacio");
        int anio = impr.nextInt()-1900;
        System.out.println("Ingrese el mes en que nacio");
        int mes = impr.nextInt();
        System.out.println("Ingrese el dia en que nacio");
        int dia = impr.nextInt();
        impr.nextLine();
        Date naci = new Date(anio, mes,dia);
        p.setFecha(naci);
    return p;
    }
    
    
    public int calcularedad(persona p){
  int anio =  p.getFecha().getYear();
  int mes =  p.getFecha().getMonth();
  int dia =  p.getFecha().getDate();
    Date fecha2 = new Date();
    int anioactual = fecha2.getYear();
    int mesactual = fecha2.getMonth()+1;
    int diaactual = fecha2.getDate();
    
        System.out.println(anioactual);
                System.out.println(mesactual);

                        System.out.println(diaactual);

    int aniodiff;
        System.out.println("");
        System.out.println(anio);
        System.out.println(mes);
        System.out.println(dia);

   
   if (mesactual>mes){
   aniodiff= anioactual-anio;
   
   }else{
   if(mesactual==mes){
   if(diaactual >= dia){
    aniodiff= anioactual-anio;
   
   }else{
        aniodiff = anioactual-anio-1;
   }
   }else{
    aniodiff = anioactual-anio-1;
   }
   
   }
        System.out.println("La persona "+p.getNombre()+" tiene un total de "+aniodiff+" años");
        return aniodiff;
    }
    
    public boolean menorQue(persona p, persona pp){
        Date fecha = p.getFecha();
        Date fecha2 = pp.getFecha();
    int a =    fecha.compareTo(fecha2);
        switch(a){
            case -1:
                return true;
            case 0:
            case 1:
                return false;
            default:
                return false;
        }
    }
    
    public void mostrarPersona(persona p){
        System.out.println(p.toString());
    
    }
    
    }
