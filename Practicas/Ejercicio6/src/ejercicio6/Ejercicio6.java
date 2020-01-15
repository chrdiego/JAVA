/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Serie Fibonacci
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
        
        
        //ANAGRAMA
        String s1 = "hola";
        String s2 = "haal";
        
        if(s1.length() == s2.length()){
            for(int i = 0; i < s1.length(); i++){
                if(!s2.contains(String.valueOf(s1.charAt(i)))){
                    System.out.println("No es un anagrama");
                    return;
                }
            }
            System.out.println("Si es un anagrama");
        }
        else{
            System.out.println("La cantidad de caracteres es difernte");
        }
    }
    
    static int Fibonacci(int n){
        if ( n > 1){
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
        else if (n == 1){
            return 1;
        }
        else if (n == 0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un número mayor o igual a 1");
            return -1;
        }
    }
}
