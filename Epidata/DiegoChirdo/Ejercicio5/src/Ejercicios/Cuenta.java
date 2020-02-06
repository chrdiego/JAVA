package Ejercicios;

import java.util.Scanner;
import java.time.LocalDate;

public class Cuenta {
	protected double saldo = 0;
	protected LocalDate apertura;
	
	public Cuenta() {
		this.apertura = LocalDate.now();
	}
	
	public Cuenta(double saldo)  {
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
	public boolean Extraer(double n) {
		if(this.saldo >= n) {
			this.saldo = saldo - n;
			System.out.println("Se han descontado $" + n + ", pasando a ser su saldo de $" + saldo);	
			return true;
		}
		else
			System.out.println("No disopne de ese monto");
		return false;
	}
	public void Depositar(double n) {
		this.saldo = saldo + n;
		System.out.println("Se han depositado $" + n +", pasando a ser su saldo de $" + saldo);
	}
	
	protected boolean Transferir(Cuenta c1, double monto, double impuesto) {
		if(this.Extraer(monto)) {
			c1.Depositar(monto);
			return true;
		}
		else return false;
	}
	
	public boolean Transferir(Cuenta c1, double monto) {
		return this.Transferir(c1, monto * 1.01, monto);
	}
	
	/*public void Transferir(Cuenta c1, double monto) {
		if(this.saldo > monto) {
			this.saldo = this.saldo - monto;
			c1.saldo += monto;			
		}
		else
			System.out.println("¡No tiene suficiente monto!");
	}*/
	
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
