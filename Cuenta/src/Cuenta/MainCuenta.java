/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class MainCuenta {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        //objeto
        LaCuenta cuenta1 = new LaCuenta();
        
        //manejar datos
        int b,c,d;
        String a;
        
        System.out.println("Digite nombre: ");
        a = entrada.next();
        cuenta1.setNombreCliente(a);
        System.out.println("Digite numero de cuenta: ");
        b = entrada.nextInt();
        cuenta1.setNumeroCuenta(b);
        System.out.println("Digite saldo: ");
        c = entrada.nextInt();
        cuenta1.setSaldo(c);
        //
        System.out.println("¿Retirar(1) Consignar(2)?");
        d = entrada.nextInt();
        if (d == 1) {
            System.out.println("¿Cuanto desea retirar?");
            int retirar = entrada.nextInt();
        } else {
        }
        System.out.println("su retiro es: "+cuenta1.retirar(c));
        
        
        
        
    }
}
