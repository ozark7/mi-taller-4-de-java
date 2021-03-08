/*
Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual, platoActual y piñonActual, de tipo entero,
método constructor, getters y setters, y los siguientes métodos miembros: acelerar (), frenar (), cambiarPlato (int plato),
y cambiarPiñon (int piñon), donde el primero dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual,
y el tercero y cuarto ajustan el plato y el piñón actual respectivamente según los parámetros recibidos. Crear una clase
principal, e instancia un objeto bicicleta y mostrar sus comportamientos.
 */
package PuntoCuatro;

/**
 *
 * @author ANDRESF
 */
public class Bici{
    //atributos
    private double velocidadActual;
    private int platoActual;
    private int piñonActual;

    //constuctores //vacio
    public Bici() {
    }
    
    //setter
    public void setVelocidadActual(double velocidad){this.velocidadActual = velocidad;};
    public void setPlatoActual(int plato){this.platoActual = plato;};
    public void setPiñonActual(int piñon){this.piñonActual = piñon;};

    
    //getter
    public double getVelocidadActual(){return this.velocidadActual;};
    public int getPlatoActual(){return this.platoActual;};
    public int getPiñonActual(){return this.piñonActual;};
    
    
    //metodos
    public double frenar(){return this.velocidadActual/2;}
    public double acelerar(){return this.velocidadActual*2;}
  
    

   
    
    
    
    
   
}
