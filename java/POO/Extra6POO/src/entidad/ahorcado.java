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
public class ahorcado {
    private String ogpalabra;
    private String [] palabra;
    private int longitud;
    private int cantjug;
    private int letrasencontradas;

    public ahorcado() {
    }

    public ahorcado(String[] palabra, int longitud, int cantjug) {
        this.palabra = palabra;
        this.longitud = longitud;
        this.cantjug = cantjug;
    }

    public String getOgpalabra() {
        return ogpalabra;
    }

    public void setOgpalabra(String ogpalabra) {
        this.ogpalabra = ogpalabra;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getCantjug() {
        return cantjug;
    }

    public void setCantjug(int cantjug) {
        this.cantjug = cantjug;
    }

    @Override
    public String toString() {
        return "ahorcado{" + "ogpalabra=" + ogpalabra + ", palabra=" + palabra + ", longitud=" + longitud + ", cantjug=" + cantjug + ", letrasencontradas=" + letrasencontradas + '}';
    }
    
    
}
