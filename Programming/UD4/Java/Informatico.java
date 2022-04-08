package empleados;

public class Informatico extends Empleado { //Clase hija de la clase padre Empleado
	//Atributos	
	private int numeroSoportes;
	//Método constructor	
	public Informatico(String nombre, String direccion, int telefono, String fecha_nac, double sueldo,int numeroSoportes) {
		super(nombre, direccion, telefono, fecha_nac, sueldo); //Herencia de atributos de la clase padre
		this.numeroSoportes = numeroSoportes;
	}
	//Métodos getter y setter para obtener y asignar los valores de los atributos
	public int getNumeroSoportes() {
		return numeroSoportes;
	}

	public void setNumeroSoportes(int numeroSoportes) {
		this.numeroSoportes = numeroSoportes;
	}
	
	//Método para obtener toda la información por consola de la clase Empleado e Informatico		
	public void getDatosinf() {
		getDatosemplado();
		System.out.println( "Numero de soportes: " +getNumeroSoportes());
		System.out.println();
	}
	
}
