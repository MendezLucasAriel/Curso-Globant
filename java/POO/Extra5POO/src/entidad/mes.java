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
public class mes {
    private String[] mese ;
    private String mesing;

    public mes() {
    }

    public mes(String[] mese, String mesing) {
        this.mese = mese;
        this.mesing = mesing;
    }

    public String[] getMese() {
        return mese;
    }

    public void setMese(String[] mese) {
        this.mese = mese;
    }

    public String getMesing() {
        return mesing;
    }

    public void setMesing(String mesing) {
        this.mesing = mesing;
    }

}
