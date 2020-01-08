/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1) Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).");
        Scanner sn = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do{
            System.out.println("Ingrese un número mayor a 0");
            num1 = sn.nextInt();
        }while(num1<=0);
        do{
            System.out.println("Ingrese otro número mayor a 0");
            num2 = sn.nextInt();
        }while(num2<=0);
        for(int i = 0; i < 10; i++){
            int numAleatorio = (int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }
    }
    
}
