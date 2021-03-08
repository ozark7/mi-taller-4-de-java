/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraccionario;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class PruebaFraccion {
    
    public static void main(String args[]){
    
        Scanner entrada = new Scanner(System.in);
        
        //variables para manejar datos
        int a,b,c,d;
        //objeto
        Fraccion fraccion1 = new Fraccion();
        
        //primer fraccionario
        System.out.println("Fraccion 1\nNumerador: ");
        a = entrada.nextInt();
        fraccion1.setNumerador1(a);
        //
        System.out.println("Denominador: ");
        b = entrada.nextInt();
        fraccion1.setDenominador1(b);
        //=========================fraccion 2============================
        System.out.println("Fraccion 2\nNumerador: ");
        c = entrada.nextInt();
        fraccion1.setNumerador2(c);
        //
        System.out.println("Denominador: ");
        d = entrada.nextInt();
        fraccion1.setDenominador2(d);
        
        //resultado
        System.out.println("Suma: "+fraccion1.sumaFraccion()+"/"+fraccion1.getDenominador1()*fraccion1.getDenominador2());
        System.out.println("Resta: "+fraccion1.restaFraccion()+"/"+fraccion1.getDenominador1()*fraccion1.getDenominador2());
        System.out.println("Multiplicacion: "+fraccion1.multiplicacionFraccion()+"/"+fraccion1.getDenominador1()*fraccion1.getDenominador2());
        System.out.println("Division: "+fraccion1.dividirFraccion()+"/"+fraccion1.getDenominador1()*fraccion1.getNumerador2());
        
        
        
        
        
        
      
        
    
    }
    
}
