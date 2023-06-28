/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.cadena;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class servicio {
     private Scanner impr = new Scanner(System.in).useDelimiter("\n");
     
     public cadena CargarCadena(){
         cadena c = new cadena();
         System.out.println("Ingrese una frase");
         c.setFrase(impr.nextLine());
         c.setLongitud(c.getFrase().length());
         return c;
     }
     
     public int mostrarVocales(cadena c){
   /*  
         String frase = c.getFrase().toLowerCase();
    int longitud = c.getLongitud();
     int cont =0;
     for (int i=0;i<longitud;i++){
     if (frase.substring(i, i+1) == "a" || frase.substring(i, i+1) == "e" || frase.substring(i, i+1) == "i" || frase.substring(i, i+1) == "o" || frase.substring(i, i+1) == "u"  ){
     cont++;
     }

   
     }
     */ 
   
        String frase = c.getFrase();
        int longitud = c.getLongitud();
        String vocales = "aeiou";
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (vocales.contains(frase.substring(i, i+1))) {
                cont++;
            }
        }
        return cont;
    }

      
     
     /*
     public void invertirFrase(cadena c){
     String frase  = c.getFrase();
     int longitud = c.getLongitud();
     char [] arrayfras = frase.toCharArray();
     String inverted = "";
     for (int i =longitud; i==0;i--){
     inverted+=arrayfras[i];
     
     }
         System.out.println("La cadena invertida es: "+inverted);
         
     }
     */
     
     public String invertirFrase(cadena cadena) {
        String frase = cadena.getFrase();
        String reverso = new StringBuilder(frase).reverse().toString();
        return reverso;
    }
     
     public int contabilizarCaracter(cadena c){
     String frase  = c.getFrase();
     int longitud = c.getLongitud();
     String caract;
     int cont=0;
     do{
         System.out.println("Ingrese el caracter a buscar");
          caract = impr.nextLine();
         
     }while (caract.length() >1);
     for (int i =0; i<longitud;i++){
     if (caract.equals(frase.substring(i,i+1))){
     cont++;
     }
     
     }        
      if (cont == 0){
          System.out.println("No se encontro el caracter");
          return 0;
      }else 
          return cont;
     
     }
      
     public void compararLong(cadena c){
         int longe =c.getLongitud();
              System.out.println("Ingrese una nueva frase");
              String frase2 = impr.nextLine();
              int longitud = frase2.length();
              if (longe >longitud){
                  System.out.println("La nueva frase es mas corta");
              }else
                  System.out.println("La nueva frase es mas larga");
              
     }
     
     
     public void concatenar(cadena c){
     String frase = c.getFrase();
         System.out.println("Ingrese una nueva frase");
         String frase2 = impr.nextLine( );
         frase = frase+frase2;
         System.out.println("Nueva frase creada: "+frase);
         
     }
     
     public void reemplazar(cadena c){
     String frase = c.getFrase();
         System.out.println("Ingrese el caracter por el que va a reemplazar");
         String asa = impr.nextLine();
     frase = frase.replaceAll("a", asa);
         System.out.println("Frase reemplazada: "+frase);
         
     
         
     }
     public boolean contains(cadena c ){
         System.out.println("Que caracter quiere buscar");
         String car = impr.nextLine();
     if (c.getFrase().contains(car)){
         return true;
     }
     else {
         return false;
     }
     }    
     
     
}
