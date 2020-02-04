package Ejercicios;

import java.awt.Color;

public abstract class Figura {
	protected Color color;
	protected float area;
	protected Punto puntos;
	
	protected abstract boolean Pertenece(Punto punto);
	protected abstract float calcularArea();
}
