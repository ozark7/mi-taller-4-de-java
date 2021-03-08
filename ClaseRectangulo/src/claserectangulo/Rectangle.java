/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claserectangulo;

/**
 *
 * @author ANDRESF
 */
public class Rectangle {
    //atributos
    float ancho,longitud;

    public Rectangle() {
        this.ancho = 15;
        this.longitud = 25;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getAncho() {
        return ancho;
    }

    public float getLongitud() {
        return longitud;
    }
    
    public float area(){
        return this.ancho*this.longitud;
        
    }
    
    public float perimetro(){
        return 2*(this.ancho+this.longitud);
    
    }
}
