/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvdiegochirdo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diego
 */
public class CVDiegoChirdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Vehiculo> lista = new ArrayList<>();
        Auto a1 = new Auto("Peugeot", "206", 2000000.00f, 4);
        Moto m1 = new Moto("Honda", "Titan", 60000.00f, "125c");
        Auto a2 = new Auto("Peugeot", "208", 250000.00f, 5);
        Moto m2 = new Moto("Yamaha", "YBR", 80500.50f, "160c");    

        lista.add(a1);
        lista.add(m1);
        lista.add(a2);
        lista.add(m2);
        
        for(Vehiculo item : lista){
        item.Mostrar();
        }
        
        System.out.println("=============================");
        
        float mayor = 0;
        float menor = a1.getPrecio();
        String modeloMayor = "";
        String modeloMenor = "";
        String marcaMayor = "";
        String marcaMenor = "";
        
        for(Vehiculo item : lista){
        if(item.getPrecio() > mayor){
            mayor = item.getPrecio();
            modeloMayor = item.getModelo();
            marcaMayor = item.getMarca();
        }
        if(item.getPrecio() < menor){
            menor = item.getPrecio();
            modeloMenor = item.getModelo();
            marcaMenor = item.getMarca();
        }
        }
        
        
        System.out.println("Vehículo más caro: " + marcaMayor + " " + modeloMayor);
        System.out.println("Vehículo más barato: " + marcaMenor + " " + modeloMenor);
        
        List<String> listaY = new ArrayList<>();
        for(Vehiculo item: lista){
            for(int contador = 0; contador < item.getModelo().length(); contador++){
                if(item.getModelo().charAt(contador) == 'Y'){
                    listaY.add(item.getMarca() + " " + item.getModelo() + " " + "$" + item.getPrecio());
                    break;
                }
            }
        }
        
        System.out.print("Vehículo que contiene en el modelo la letra 'Y': ");
        System.out.println(listaY);
        
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        
        for(Vehiculo item : lista){
            item.MostrarOrdenado();
        }
        
    }
    
}
