package Ejercicios;

public class CuentaComoTransferencia extends Cuenta{
	
	public boolean Transferir(Cuenta destino, double suma) {
		if(this.Extraer(suma * 1.01)){
			destino.Depositar(suma);
			return true;
		}
		else
			return false;
	}
	
	/*public boolean Transferir(Cuenta destino, double suma) {
		
	}*/
	
	
	/*public void Transferir(Cuenta c1, int monto) {
		if(this.saldo > (monto + monto * 15 / 100)) {
			super.Transferir(c1, monto);
			this.saldo = saldo - (monto * 15 / 100);
		}
		else
			System.out.println("¡No tiene suficiente monto!");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
