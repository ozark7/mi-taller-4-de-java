/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rueda;

/**
 *
 * @author ANDRESF
 */
public class T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TrianguloPepe t1 = new TrianguloPepe();
        t1.setBase(4);
        t1.setAltura(4);
        System.out.println("base: "+t1.getBase());
        System.out.println("altura: "+t1.getAltura());
        System.out.println("area: "+t1.area()+"cm²");
        System.out.println("longitud lados: "+t1.lados()+" cm");
        System.out.println("perimetro: "+t1.perimetro()+" cm");
        System.out.println("vertice: "+t1.vertice()+"°");
        
        //t1.area();
        //t1.longitud_lados();
    }

}
    
