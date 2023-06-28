/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author teenc
 */
public class numeros {
    public double miArray[];
    private double n2[];
    static int size = 50;
    public numeros(double[] miArray, double[] n2) {
        
        this.n2 = n2;
    }

    public double[] getMiArray() {
        return miArray;
    }

    public void setMiArray(double[] miArray) {
        this.miArray = miArray;
    }

    
  public numeros(int size) {
    miArray = new double[size];
  }

    public numeros() {
    }

   

  

    public double[] getN2() {
        return n2;
    }

    public void setN2(double[] n2) {
        this.n2 = n2;
    }

   
    
}
