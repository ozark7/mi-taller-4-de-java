/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreCaida;

import java.util.Scanner;



/**
 *
 * @author ANDRESF (ozark)
 */
public class PruebaCaida {
    
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        //variables para manejar los datos
        double c;
        
        //objeto
        Caida objeto1 = new Caida();
              
        System.out.println("¿Cuanto tiempo duró cayendo?(segundos)");
        c = entrada.nextDouble();
        objeto1.setTiempo(c);
        //muestra de datos concluidos
        System.out.println("distancia: "+objeto1.distancia()+" metros");
        System.out.println("velocidad final: "+objeto1.velocidadFinal()+" m/s");
        
        
        
       
        
        
    }
}
