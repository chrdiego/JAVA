package Ejercicios;


public class Resta {

	private Punto punto;
	private float y;
	private float m;
	
	public Resta(float punto, float pendiente) {
		this.punto = punto;
		this.pendiente = pendiente;
	}
	
	public boolean esPunto(Resta r) {
		return true;
	}
	
	public String toString() {
		return "(" + punto + ", " + pendiente + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Resta r = new Resta(5, 6/5);
	System.out.println(r.toString());
	}

}
