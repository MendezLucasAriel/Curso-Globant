/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12poo;

import entidad.persona;
import service.personaservice;

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
        personaservice sv = new personaservice();
        persona p = sv.crearpersona();
        sv.calcularedad(p);
        persona pp = sv.crearpersona();
        System.out.println(sv.menorQue(p, pp));
        if(  sv.menorQue(p,pp)){
            System.out.println(p.getNombre()+" no es menor que "+pp.getNombre());
        } else{
            System.out.println(p.getNombre()+" es menor que "+pp.getNombre());
        }
        sv.mostrarPersona(p);
        sv.mostrarPersona(pp);
    }
    
}
