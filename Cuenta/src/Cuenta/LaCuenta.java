/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author ANDRESF
 */
public class LaCuenta {
    
    //atributos 
    int numeroCuenta,saldo;
    String nombreCliente;
    
    //constructor
    public LaCuenta() {
    
    }
    
    //setters
    public void setNumeroCuenta(int b) {
        this.numeroCuenta = b;
    }
    public void setNombreCliente(String a) {
        this.nombreCliente = a;
    }
    public void setSaldo(int c) {
        this.saldo = c;
    }
    
    //getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public boolean retirar(int retirar){
        if (retirar <= 0 || retirar >this.saldo) {
            return false;
        } else {
            return true;
        }
       
    }
    
    public boolean consignar(){
        return true;
    }
}
