/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1) Imprimir Hola mundo! por pantalla ");
        System.out.println("Hola mundo!");
        
        System.out.println("==========================================");
        
        System.out.println("2) Realizar la suma, resta, multiplicación, división y resto de dos números.");
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int a = sn.nextInt();
        System.out.println("Ingrese otro número: ");
        int b = sn.nextInt();
        Suma(a, b);
        Resta(a, b);
        Multi(a, b);
        Div(a, b);
        Resto(a, b);
        
        System.out.println("=========================================="); 
        
        System.out.println("3) Pasar esos números ingresados por consola a carácter ASCII: ");
        System.out.println("Numero 1: " + (char)a + "\nNumero 2: " + (char)b);
        
        System.out.println("==========================================");
        
        System.out.println("4) Indicar si los números pasados son pares o no: ");
        EsPar(a);
        EsPar(b);
        
        System.out.println("==========================================");
        
        System.out.println("5) Indicar si los números pasados son mayor, menor, o iguales entre sí: ");
        SonIguales(a, b);
    }
    
    public static void Suma(int a, int b){
        System.out.println("Suma: " + (a + b));
    }
    
    public static void Resta(int a, int b){
        System.out.println("Resta: " + (a - b));
    }
    
    public static void Multi(int a, int b){
        System.out.println("Multiplicación: " + (a * b));
    }
    
    public static void Div(int a, int b){
        System.out.println("División: " + (a / b));
    }
    
    public static void Resto(int a, int b){
        System.out.println("Resto: " + (a % b));
    }
    
    public static void EsPar(int a){
        if(a%2==0)
            System.out.println("El número " + a + " es par");
        else
            System.out.println("El número " + a + " es impar");
    }
    
    public static void SonIguales(int a, int b){
        if(a > b)
            System.out.println(a + " es mayor que " + b);
        if(a < b)
            System.out.println(a + " es menor que " + b);
        if(a == b)
            System.out.println(a + " y " + b + " son iguales");
    }
}
