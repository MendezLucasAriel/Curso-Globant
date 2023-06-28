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
public class CuentaBancaria {
    
    private long dni;
    private int ncuenta;
    private int saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long dni, int ncuenta, int saldo) {
        this.dni = dni;
        this.ncuenta = ncuenta;
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria \n" + "dni=" + dni + "\n"+ " ncuenta=" + ncuenta + "\n"+ ", saldo=" + saldo ;
    }
    

    
    
    
    
    
}
