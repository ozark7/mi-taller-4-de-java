/*
Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos que considere
necesarios. Crear una clase PruebaCoche que instancie varios coches, cambiándole el color a lo largo de la vida a
algunos de ellos y mostrándolo por pantalla.
 */
package punto2;

/**
 *
 * @author ANDRESF
 */
public class Coche {

    //atributos
    String color,marca,matricula;
    int caballos,puertas,modelo;
    
    //constructores
    public Coche(){
        this.color ="";
        this.marca ="";
        this.modelo = 0;
        this.matricula = "";
        this.caballos = 0;
        this.puertas = 0;
        
    }

    public String getColor() {
        return color;
    }
    
    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
    //metodo
    public void datos(){
        System.out.println("color: "+color);
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("matricula: "+matricula);
        System.out.println("caballos: "+caballos);
        System.out.println("puertas: "+puertas);
        System.out.println("\n***************************\n");
    }
    
    
}
