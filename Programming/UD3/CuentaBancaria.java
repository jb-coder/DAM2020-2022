package programacion_tarea2_UD3;

public class CuentaBancaria {
	
	private String cliente;

	private String numeroCuenta;

	private int saldoActual;
	//Método Constructor
	public CuentaBancaria(String cliente, String numeroCuenta, int saldoActual) {
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.saldoActual = saldoActual;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public String getnumeroCuenta() {
		return numeroCuenta;
	}
	
	public int getsaldoActual() {
		return saldoActual;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " +getCliente()+
	   			  "\nNumero de la cuenta: " +getnumeroCuenta()+
	   			  "\nSu saldo disponible es: " +getsaldoActual()+ "€");
		System.out.println();
    }		
	
	public static void main(String args[]) {
		CuentaBancaria usuario1 = new CuentaBancaria("Javier", "ES6000491500051234567892", 4567);
		CuentaBancaria usuario2 = new CuentaBancaria("Pepito", "ES1000492352082414205416", 167);		
		usuario1.mostrarDatos();
		usuario2.mostrarDatos();
	
	}	
}
