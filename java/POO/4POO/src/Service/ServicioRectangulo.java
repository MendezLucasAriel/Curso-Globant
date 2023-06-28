/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author teenc
 */
public class ServicioRectangulo {
    private Scanner impr = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo CargarDatos(){
    Rectangulo r1 = new Rectangulo();
        System.out.println("Dame la altura");
        r1.setAltura(impr.nextInt());
        System.out.println("Dame la base");
        r1.setBase(impr.nextInt());
        return r1;
    
    }
    
    
    public int Super(int b, int a){
    return b*a;
    
    }
    
    public int Peri(int b, int a){
    return (b+a)*2;
    }
}
