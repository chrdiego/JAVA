/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Diego
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).");
        String cadena = "La lluvia en Sevilla es una maravilla";
        int contador = 0;
        for(int i = 0; i<cadena.length(); i++){
            if(cadena.charAt(i) == 'a' || 
                    cadena.charAt(i) == 'e' ||
                    cadena.charAt(i) == 'i' ||
                    cadena.charAt(i) == 'o' ||
                    cadena.charAt(i) == 'u'
                    )
                contador++;
        }
        System.out.println("En total tiene la cadena tiene " + contador + " vocales");
        
        System.out.println("===========================================");
        
        System.out.println("2) Reemplaza todas las a del String anterior por una e.");
        System.out.println(cadena.replace('a', 'e'));
    }
    
}
