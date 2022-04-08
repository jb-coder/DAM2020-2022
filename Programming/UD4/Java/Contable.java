package empleados;

public class Contable extends Empleado { //Clase hija de la clase padre Empleado
	//Atributos	
	private int numeroingresos;
	private int numeroegresos;
	//Método constructor	
	public Contable(String nombre, String direccion, int telefono, String fecha_nac, double sueldo, int numeroingresos,
			int numeroegresos) {
		super(nombre, direccion, telefono, fecha_nac, sueldo); //Herencia de atributos de la clase padre
		this.numeroingresos = numeroingresos;
		this.numeroegresos = numeroegresos;
	}
	//Métodos getter y setter para obtener y asignar los valores de los atributos
	public int getNumeroingresos() {
		return numeroingresos;
	}

	public void setNumeroingresos(int numeroingresos) {
		this.numeroingresos = numeroingresos;
	}

	public int getNumeroegresos() {
		return numeroegresos;
	}

	public void setNumeroegresos(int numeroegresos) {
		this.numeroegresos = numeroegresos;
	}
	//Método para obtener toda la información por consola de la clase Empleado y contable	
	public void getDatoscont() {
		getDatosemplado();
		System.out.println( "Numero de ingresos: " +getNumeroingresos()+
	   			  			"\nNumero de egresos: " +getNumeroegresos());
		System.out.println();
	}
	
}
