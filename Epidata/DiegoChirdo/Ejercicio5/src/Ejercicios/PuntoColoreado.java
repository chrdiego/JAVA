package Ejercicios;
import java.awt.Color;
import java.util.ArrayList;


public class PuntoColoreado extends Punto {
	private Color color;
	
	public PuntoColoreado(int x, int y) {
		super(x, y);
	}
	
	public Color color(){
		return this.color;
	}
	
	public void CambiarColor(Color color) {
		this.color = color;
	}
	
	public String toString() {
		return color + super.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		for(int i = 0; i < 20; i++) {
			array.add("" + i + "");
		}
		for(String e : array) {
			System.out.println(e);
		}
	}

}
