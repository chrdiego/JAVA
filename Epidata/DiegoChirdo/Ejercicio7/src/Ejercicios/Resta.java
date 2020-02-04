package Ejercicios;


public class Resta {

	private Punto punto;
	private float m;
	
	public Resta(Punto p, float pendiente) {
		this.punto = p;
		this.m = pendiente;
	}
	
	public boolean equals(Resta r) {
		if(this.punto.equals(r.punto) && this.m == r.m){
			return true;
		}
		else
			return false;
	}
	
	public Resta copy(){
		return new Resta(this.punto, this.m);
	}
	
	public boolean esPunto(Resta r) {
		return true;
	}
	
	public String toString() {
		return "(" + punto + ", " + m + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Resta r = new Resta(5, (6/5));
	System.out.println(r.toString());
	}
}
