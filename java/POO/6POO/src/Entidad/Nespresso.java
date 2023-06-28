/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author teenc
 */
public class Nespresso {
    private int capacidadmaxima;
    private int cantidadactual;

    public Nespresso() {
    }

    public Nespresso(int capacidadmaxima, int cantidadactual) {
        this.capacidadmaxima = capacidadmaxima;
        this.cantidadactual = cantidadactual;
    }

    public int getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public void setCapacidadmaxima(int capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public int getCantidadactual() {
        return cantidadactual;
    }

    public void setCantidadactual(int cantidadactual) {
        this.cantidadactual = cantidadactual;
    }

    @Override
    public String toString() {
        return "Nespresso " + "capacidadmaxima=" + capacidadmaxima + "\n" +", cantidadactual=" + cantidadactual + '}';
    }
  
}
