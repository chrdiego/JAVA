package Ejercicios;

import java.util.Scanner;
import java.time.LocalDate;

public class Cuenta {
	private int saldo = 0;
	private LocalDate apertura;
	
	public Cuenta() {
		this.apertura = LocalDate.now();
	}
	
	public Cuenta(int saldo)  {
		this.saldo = saldo;
	}
	
	public static void Menu(){
		System.out.println("1) Depositar");
		System.out.println("2) Extraer");
		System.out.println("3 Consultar");
		System.out.println("4) Transferir");
		System.out.println("5) Salir");
		System.out.println("Ingrese una opción: ");
	}
	
	public void ConsultarSaldo() {
		System.out.println("Su saldo es de: $" + this.saldo);
	}
	public void Extraer(int n) {
		if(this.saldo > n) {
			this.saldo = saldo - n;
			System.out.println("Se han descontado $" + n + ", pasando a ser su saldo de $" + saldo);			
		}
		else
			System.out.println("No disopne de ese monto");
	}
	public void Depositar(int n) {
		this.saldo = saldo + n;
		System.out.println("Se han depositado $" + n +", pasando a ser su saldo de $" + saldo);
	}
	
	public void Transferir(Cuenta c1, int monto) {
		if(this.saldo > monto) {
			this.saldo = this.saldo - monto;
			c1.saldo += monto;			
		}
		else
			System.out.println("¡No tiene suficiente monto!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		Scanner sn = new Scanner(System.in);
		cuenta.ConsultarSaldo();
		int opcion = 0;
		while(opcion != 5) {
			Menu();
			opcion = sn.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese un monto a depositar: ");
				cuenta.Depositar(sn.nextInt());
				break;
			case 2:
				System.out.println("Ingrese un monto a extraer: ");
				cuenta.Extraer(sn.nextInt());
				break;
			case 3: 
				cuenta.ConsultarSaldo();
				break;
			case 4:
				System.out.println("Ingrese cuanto quiere transferir: ");
				cuenta.Transferir(cuenta2, sn.nextInt());
				break;
			case 5:
				break;
			}
		}
	}
}
