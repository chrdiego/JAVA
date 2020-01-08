/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("1) Mostrar del 1 al 100 usando un bucle while: ");
        int contador = 0;
        while(contador <= 100)
        {
            System.out.println(contador);
            contador++;
        }
        
        System.out.println("==============================================");
        
        System.out.println("2) Mostrar del 1 al 100 usando un bucle for: ");
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
        
        System.out.println("==============================================");
        
        System.out.println("3) Mostrar del 1 al 100 que sean divisibles entre 2 y 3 (ambos): ");
        for (int i = 0; i <= 100; i++){
            if(i%2 == 0 && i%3 == 0)
                System.out.println(i);
        }
        
        System.out.println("==============================================");
        
        System.out.println("4) Realizar la suma del 1 al número que indiquemos, éste debe ser mayor que 1: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        while(num <= 1){
            System.out.println("El número debe ser mayor que 1");
            num = sn.nextInt();
        }
        System.out.println("El número " + num + " + 1 es " + (num + 1));
        
        System.out.println("==============================================");
        
        System.out.println("4) Crear una aplicación que nos permita ingresar números hasta que insertemos un -1: ");
        int num2 = sn.nextInt();
        int cont = 0;
        while(num2 != -1){
            num2 = sn.nextInt();
            cont++;
        }
        System.out.println("Cantidad de números ingresados: " + cont);
    }
}
