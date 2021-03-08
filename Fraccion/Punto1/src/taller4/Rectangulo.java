/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;
/**
 *
 * @author ANDRESF
 */
public class Rectangulo {
    //atributos
    private double base;
    private double altura;
    
    
    // constructor
    public Rectangulo(){
        this.base=0;
        this.altura=0;
    }
    
    // getter y setter
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double b){
        this.base = b;
    }
    
    public void setAltura(double a){
        this.altura=a;
    }
    
    // funciones miembros
    
    public double calcularArea(){
       return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (this.base+this.altura);
    }
}