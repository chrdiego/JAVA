

import java.util.Scanner;

public class Punto {
	private int x = 0;
	private int y = 0;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	
	public boolean equals(Punto p) {
		if(this.x() == p.x() && this.y() == p.y())
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public void Calcular(Punto p) {
		System.out.println("X: " + (this.x() - p.x()) * (this.x() - p.x()) + (this.y() - p.y()) * (this.y() - p.y()));
	}
	
	public void DistanciaCoordenadaOrigen(Punto p) {
		System.out.println((this.x() * this.x()) - (this.y() - this.y()));
	}
	
	public void Desplazar(char opcion) {
		Scanner sn = new Scanner(System.in);
		while(opcion != x || opcion != y) {
			if(opcion == x) {
				System.out.println("Ingrese un nuevo punto para X: ");
				this.x = sn.nextInt();
				break;
			}
			else
			{
				System.out.println("Ingrese un nuevo punto para Y: ");
				this.y = sn.nextInt();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
