package Ejercicios;

public class Ejercicio4 {
	boolean salude = false;
	public void saludar() {
		if(!salude) {
			salude = true;
			System.out.println("Hello world!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio4 ej = new Ejercicio4();
		ej.saludar();
		ej.saludar();
	}

}
