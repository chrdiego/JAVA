package Ejercicios;

import java.time.LocalDate;

public class CuentaNegativa extends Cuenta{
	protected double deuda;
	
	public CuentaNegativa() {
		
	}
	
	public CuentaNegativa(double saldo){
		super(saldo);
		this.deuda = 0;
	}
	
	public void Endeudar(float deuda) {
		this.saldo -= deuda;
		this.deuda = deuda;
	}
	
	/*public boolean Extraer(double n) {
		if(!super.Extraer(n)) {
			this.Depositar((this.saldo - n) * - 1);
			super.Extraer(n);
			this.deuda = this.saldo - n;
			return true;
		}
		else
			return super.Extraer(n);
	}*/
	
	public boolean Extraer(double n) {
		if(this.saldo + deuda > n) {
			saldo -= n;
			return true;
		}
		else
			return false;
	}
	
	protected boolean Transferir(Cuenta c1, double monto, double impuesto) {
		if(!super.Transferir(c1, monto, impuesto)) {
			this.Depositar(this.saldo - monto);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaNegativa cuenta = new CuentaNegativa();
		cuenta.saldo = 20;
		cuenta.deuda = -35;
		cuenta.Extraer(45);
		System.out.println(cuenta.saldo + " " + cuenta.deuda);
	}

}
