package Ejercicios;

import java.awt.Color;

public class Circulo extends Figura{
	private float radio;
	
	public Circulo(Punto p1, float radio, Color color) {
		this.puntos = p1;
		this.radio = radio;
		this.color = color;
	}
	
	public float calcularArea() {
		return (float) (Math.PI * Math.pow(radio, 2));
	}
	
	protected boolean Pertenece(Punto punto) {
		return ((Math.pow(punto.x() - this.puntos.x(), 2)) + (Math.pow(punto.y() - this.puntos.y(), 2)) < Math.pow(this.radio, 2));
	}
}