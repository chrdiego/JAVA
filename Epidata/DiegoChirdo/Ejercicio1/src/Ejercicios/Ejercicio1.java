package Ejercicios;
import java.util.Scanner;

//import java.util.Scanner;

public class Ejercicio1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ingrese un numero: ");
			Scanner sn = new Scanner(System.in);
			int numero = sn.nextInt();
			Divisores(numero);
			
		}

		public static void Divisores(int n) {
			for(int i = 1; i < n; i++) {
				if(n % 2 == 0)
					System.out.println(n);
			}
		}
		
		public static boolean esPrimo(int n) {
			int contador = 2;
			boolean primo = true;
			while ((primo) && (contador!=n)) {
				if(n%contador == 0) {
					primo=false;
				contador++;
				}
			}
			return primo;
		}
}