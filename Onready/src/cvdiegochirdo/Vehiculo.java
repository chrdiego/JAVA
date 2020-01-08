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
public abstract class Vehiculo implements IMostrar {
    String marca;
    String modelo;
    float precio;
    
    public Vehiculo(String marca, String modelo, float precio){
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void Mostrar(){
    System.out.println("Marca: " + this.marca + " // Modelo: " + this.modelo + " // Precio: $" + this.precio);
    }
    
    public void MostrarOrdenado(){
         System.out.println(this.marca + " " + this.modelo);
     }
}
