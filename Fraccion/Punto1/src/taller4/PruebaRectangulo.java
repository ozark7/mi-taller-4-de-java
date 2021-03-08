/*
Crear una clase Rectángulo, con atributos longitud y ancho. Crear también el constructor de la clase y los métodos
necesarios para calcular el área y el perímetro. Crear otra clase PruebaRectangulo que pruebe varios rectángulos y
muestre por pantalla sus áreas y perímetros.
 */
package taller4;

public class PruebaRectangulo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r = new Rectangulo();
        Rectangulo r1 = new Rectangulo();
        //cambia de estado objeto 1
        r.setAltura(565);
        r.setBase(450);
        //cambia de estado objeto 2
        r1.setAltura(89);
        r1.setBase(45);
        
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Area de rectangulo: " + r.calcularArea());
        System.out.println("Perimetro: "+r.calcularPerimetro());
        
        System.out.println("Base 2: " + r1.getBase());
        System.out.println("Altura 2: " + r1.getAltura());
        System.out.println("Area de rectangulo  2: " + r1.calcularArea());
        System.out.println("Perimetro 2: "+r1.calcularPerimetro());
    }
}
