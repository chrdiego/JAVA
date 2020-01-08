/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello. ");
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un día: ");
        String dia = sn.next();
        switch (dia){
        case "lunes":
        case "martes":
        case "miercoles":
        case "jueves":
        case "viernes":
            System.out.println("Es un día laborable");
            break;
        case "sabado":
        case "domingo":
            System.out.println("Es un dia no laborable");
            break;
        default:
            System.out.println("El día no corresponde");
            break;
    }
        
        System.out.println("============================================");
        
        System.out.println("Lo mismo pero con JOptionPane");
        String dia2 = JOptionPane.showInputDialog("Ingrese un día");
        switch(dia2){
        case "lunes":
        case "martes":
        case "miercoles":
        case "jueves":
        case "viernes":
            JOptionPane.showMessageDialog(null, "Es un día laborable");
            break;
        case "sabado":
        case "domingo":
            JOptionPane.showMessageDialog(null, "Es un día no laborable");
            break;
        default:
            JOptionPane.showMessageDialog(null, "El día ingresado no corresponde");
            break;
        }
    }   
}
