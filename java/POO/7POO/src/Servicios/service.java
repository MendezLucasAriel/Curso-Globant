/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class service {
     private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        boolean amongus;
        Persona p = new Persona();
        System.out.println("Cual es tu nombre?");
        p.setNombre(impr.nextLine());
        do {
        System.out.println("Cual es tu sexo?");
        p.setSexo(impr.nextLine());
        amongus = false;
        switch (p.getSexo()){
            case "M":
            case "m":
                
                break;
            case "F":
            case "f":
                    
                break;
                
            case "O":
            case "o":
                break;
                
            default:
                     amongus = true;
        }
            System.out.println( amongus);
        }while (amongus == true);
        System.out.println("Cual es tu edad?");
        p.setEdad(impr.nextInt());
        System.out.println("Cual es tu peso");
        p.setPeso(impr.nextInt());
        System.out.println("Cual es tu altura en cm");
        p.setAltura(impr.nextInt());
        impr.nextLine();
        return p;
                
    
    }
    
    
    public int calcularIMC(Persona p){
    double imc;
    double a = p.getAltura();
    double b = a/100;
    System.out.println("altura"+a);
    System.out.println("altura"+b);
        System.out.println("peso"+p.getPeso());
    imc = p.getPeso()/(b*b);
        System.out.println("IMC"+imc);
    if (imc < 20){
    return -1;
    }else
        if (imc<25){
        return 0;
        }else
            return 1;
    }
    
    public boolean esMayorDeEdad(Persona p){
    if (p.getEdad()>18)
        return true;
    else
        return false;
    }
    
    
  public int casea(int a){
      int xd=0;
      switch (a){
      case -1:
          xd=10;
      break;
      
      case 0:
      xd=20;
    break;
      case 1:
      xd = 30;
      break;
  }
      return xd;
  }
}
