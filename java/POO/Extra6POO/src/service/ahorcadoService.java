/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.ahorcado;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class ahorcadoService {
                             private Scanner impr = new Scanner(System.in).useDelimiter("\n");

    public ahorcado crearJuego(){
     ahorcado a = new ahorcado();
        System.out.println("Ingrese la palabra a buscar");
        String palabras = impr.nextLine();
        a.setOgpalabra(palabras);
        a.setLongitud(palabras.length());
        String [] array = new String[a.getLongitud()];
        for (int i =0; i<a.getLongitud();i++){
        array[i]= palabras.substring(i, i+1);
            System.out.println(array[i]);
        
        }
        a.setPalabra(array);
        do{
        System.out.println("Ingrese el numero de jugadas maximas");
                a.setCantjug(impr.nextInt());
        }while (a.getCantjug()<= 0);
        impr.nextLine();
        a.setLetrasencontradas(0);
        return a;
    }
    
    
    public void Longitud(ahorcado a){
        System.out.println("La longitud de la palabra es de: "+a.getLongitud());
    }
    
    public int buscar(ahorcado a, String pal){
        int cont =0;
        String [] array = a.getPalabra();
    for(int i=0;i<a.getLongitud();i++){
    if (a.getPalabra()[i].equals(pal)){
    cont=cont+1;
    array[i] = "/$)%&#%$)$";
    }
    a.setPalabra(array);
    }
    if (cont>0)
        return cont;
        else
        return 0;
    }
    
    public int encontradas(ahorcado a){
        System.out.println("Se han encontrado: "+a.getLetrasencontradas());
        String pal;
        int cont;
        do{
        System.out.println("Ingrese una letra");
         pal = impr.nextLine();
        }while (pal.length()>1);
        int restaintentos;
      restaintentos =  buscar(a,pal);
      
      
      
        if (restaintentos == 0){
        a.setCantjug(a.getCantjug()-1);
            System.out.println("No se a encontrado la letra");
            intentos(a);
            if (a.getCantjug()==0){
            System.out.println("Se te acabaron los intentos, perdiste, la palabra era "+a.getOgpalabra());
      return 3;
      }
            return 0;
        }else{
        a.setLetrasencontradas(a.getLetrasencontradas()+restaintentos);
            System.out.println("Se encontro la letra "+restaintentos+" veces en la palabra");
            intentos(a);
            if (a.getLetrasencontradas() == a.getLongitud()){
          System.out.println("Felicidades encontraste la palabra, la misma era "+a.getOgpalabra());
          return 3;
      }
            return 1;
        }
    }
    
    public void intentos(ahorcado a){
        System.out.println("Le quedan "+a.getCantjug()+" jugadas");
    
    }
    
    public void juego(){
  ahorcado a =  crearJuego();
  int cont =0;
  int total= 99999999;
    for (int i =0; i<=total;i++){
  if (  encontradas(a) == 3){
  i=total;
  }
    
    }
    }
    
}
