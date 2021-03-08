/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreCaida;

/**
 *
 * @author ANDRESF
 */
public class Caida {
    
    //atributos
    double tiempo;

    //constructor vacio
    public Caida() {
        
    }
    
    //setters
    public void setTiempo(double tiempo) {this.tiempo = tiempo;}
    
    //getters 
    public double getTiempo() {return tiempo;}
    
    //metodos
    public double distancia(){
        return ((9.81)*(this.tiempo * this.tiempo))/2;
    }
    public double velocidadFinal(){
        return (9.81 * this.tiempo);
    }
}
