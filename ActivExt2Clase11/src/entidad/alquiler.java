/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author teenc
 */
public class alquiler {
   private String peliculaAlquilada;
   private Date fechaDeInicio;
   private Date fechaDeFin;
   private double precio;

    public alquiler() {
    }

    public alquiler(String peliculaAlquilada, Date fechaDeInicio, Date fechaDeFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.precio = precio;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "alquiler{" + "peliculaAlquilada=" + peliculaAlquilada + ", fechaDeInicio=" + fechaDeInicio + ", fechaDeFin=" + fechaDeFin + ", precio=" + precio + '}';
    }
   
   
   
   
}
