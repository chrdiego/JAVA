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
public class Moto extends Vehiculo implements IMostrar {
    String cilindrada;
    
    public Moto(String marca, String modelo, float precio, String cilindrada){
    super(marca, modelo, precio);
    this.cilindrada = cilindrada;
    }
    
    public void Mostrar(){
    System.out.println("Marca: " + this.marca + " // Modelo: " + this.modelo + " // Cilindrada: " + this.cilindrada + " // Precio: $" + this.precio);
    }

}
