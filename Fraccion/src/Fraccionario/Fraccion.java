/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraccionario;

/**
 *
 * @author ANDRESF
 */
public class Fraccion {
    
    //atributos
    int denominador1,denominador2,numerador1,numerador2;
    
    //constructor
    public Fraccion() {
    
    }
    
    //setter
    public void setDenominador1(int denominador) {
        this.denominador1 = denominador;
    }

    public void setDenominador2(int denomina) {
        this.denominador2 = denomina;
    }

    public void setNumerador1(int numerador) {
        this.numerador1 = numerador;
    }

    public void setNumerador2(int numera) {
        this.numerador2 = numera;
    }
    
    //getter

    public int getDenominador1() {
        return denominador1;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public int getNumerador2() {
        return numerador2;
    }
    
    //metodos
    public int sumaFraccion(){
        return (this.numerador1*this.denominador2+this.numerador2*this.denominador1);
    }
    
    public int restaFraccion(){
        return (this.numerador1*this.denominador2-this.numerador2*this.denominador1);
        
    }
    public int multiplicacionFraccion(){
        return (this.numerador1*this.numerador2);
    }
    
    public int dividirFraccion(){
        return (this.numerador1*this.denominador2);
    }
    
    
    
}
