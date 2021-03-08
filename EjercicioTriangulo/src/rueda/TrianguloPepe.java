/*
triangulo isosceles
 */
package rueda;

/**
 *
 * @author ANDRESF
 */
public class TrianguloPepe {
     //atributos
    private double base;
    private double altura;

    //constructor
    public TrianguloPepe() {}
    
    
    //getter
    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    //setter
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //metodos para calculos
    public double area(){
        return (base * altura)/2; 
    }
    
    //Math.sqrt = sirve para sacar raiz
    public double lados(){
        double hipotenusa = (double) ((double) Math.pow((this.base/2),2)+ Math.pow(this.altura, 2));
        return (double) Math.sqrt(hipotenusa);
    }    
    
    public double perimetro(){
        return (2*lados()+this.base);
    }
    
    //Math.asin = arcoseno Math.toDegrees = angulo a radianes
    public double vertice(){
        return Math.toDegrees(2*(Math.asin((this.base/2)/this.altura)));
    }
}