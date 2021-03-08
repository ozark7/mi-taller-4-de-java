/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoCuatro;

import java.util.Scanner;

/**
 *
 * @author ANDRESF (ozark)
 */
public class PruebaBici {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //variables para manejar los datos
        double a;
        int b,c;
        String d;
        
        //objeto
        Bici bicicleta1 = new Bici();
        //velocidad
        System.out.println("Digite velocidad actual: ");
        a = entrada.nextDouble();
        bicicleta1.setVelocidadActual(a);
        //piñon
        System.out.println("Digite numero de piñon: ");
        b = entrada.nextInt();
        bicicleta1.setPiñonActual(b);
        //
        System.out.println("Digite numero de plato: ");
        c = entrada.nextInt();
        bicicleta1.setPlatoActual(c);
        //
        System.out.println("Datos:\n"+bicicleta1.getVelocidadActual()+" m/s\n"+"Piñon "+bicicleta1.getPiñonActual()+"\n"+"Plato "+bicicleta1.getPlatoActual());
        //
        System.out.println("¿Desea acelerar?(s/n)");
        d = entrada.next();
        if ("s".equals(d)) {
            System.out.println("Su velocidad ahora es de: "+bicicleta1.acelerar()+" m/s");
        } else {
            System.out.println("¿Desea entonces frenar?(s/n)");
            d = entrada.next();
            if ("s".equals(d)) {
                System.out.println("Su velocidad ahora es de: "+bicicleta1.frenar()+" m/s");
            } else {
            }
        }
    }
}
