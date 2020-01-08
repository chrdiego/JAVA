/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvdiegochirdo;

/**
 *
 * @author Diego
 */
public class Auto extends Vehiculo implements IMostrar {
    int puertas;
    
    public Auto(String marca, String modelo, float precio, int puertas) {
    super(marca, modelo, precio);
    this.puertas = puertas;
    }
    
    public void Mostrar(){
        System.out.println("Marca: " + this.marca + " // Modelo: " + this.modelo + " // Puertas: " + this.puertas + " // Precio: $" + this.precio);
    }
    
}
