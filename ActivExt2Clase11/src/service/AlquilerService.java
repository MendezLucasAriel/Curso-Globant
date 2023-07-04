/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.Date;
import entidad.alquiler;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class AlquilerService {
     private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    public alquiler crearAlquiler(String pelicula, Date fechaini, Date fechafin, double precio){
        
      alquiler a = new alquiler(pelicula, fechaini, fechafin, precio);
      a.setPrecio(calcularIngreso(a));
         return a;
         
    }
     public alquiler crearAlquiler(){
        alquiler a = new alquiler();
        PeliculaService sv = new PeliculaService();
        do{
        System.out.println("Ingrese la pelicula a alquilar");
        a.setPeliculaAlquilada(impr.nextLine());
        }while (sv.buscarTitulo() == false); 
         System.out.println("Ingrese el dia mes y año en el que alquilo la pelicula");
         int dia = impr.nextInt();
         int mes = impr.nextInt();
         int anio = impr.nextInt()-1900;
         Date fecha = new Date(anio,mes,dia);
         a.setFechaDeInicio(fecha);
          System.out.println(fecha);
         System.out.println("Ingrese por cuantos dias va a tener la pelicula");
         dia = impr.nextInt();
        // System.out.println(fecha);
         a.setPrecio(calcularIngreso(a));
          fecha = new Date(anio,mes,dia);
         a.setFechaDeFin(fecha);
         
         return a;
         
    }
    
    public void listarAlquiler(alquiler a){
        a.getPeliculaAlquilada();
    
        System.out.println("Pelicula"+a.getPeliculaAlquilada());
        System.out.println("Alquilada el:"+a.getFechaDeInicio());
        System.out.println("Alquilada hasta:"+a.getFechaDeFin());
        System.out.println("Cuesta un total de:"+a.getPrecio());
    }
    
    public boolean buscarAlquilerFecha(){
        
    return true;
    }
    
    public double calcularIngreso(alquiler a){
        
             long dia =   (a.getFechaDeFin().getTime()-a.getFechaDeInicio().getTime())/(24*3600*1000);
             if (dia <= 3){
             a.setPrecio(10);
             }else{
             a.setPrecio(10+1*(dia-3));
             }
        return a.getPrecio();
    }
    
}
