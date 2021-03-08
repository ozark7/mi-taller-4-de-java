/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author ANDRESF
 */
public class PruebaCoche {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        coche1.setCaballos(45);
        coche1.setColor("naranja");
        coche1.setMarca("audi");
        coche1.setMatricula("123-aaa");
        coche1.setModelo(2021);
        coche1.setPuertas(4);
        coche1.datos();
        
        
    }
}
