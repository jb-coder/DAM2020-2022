package empleados;

public class Administrativo extends Empleado { //Clase hija de la clase padre Empleado
	//Atributos
	private int numerollamadas;
	private double tiempototalllamadas;
	//Método constructor
	public Administrativo(String nombre, String direccion, int telefono, String fecha_nac, double sueldo,
			int numerollamadas, double tiempoTotalllamadas) {
		super(nombre, direccion, telefono, fecha_nac, sueldo); //Herencia de atributos de la clase padre
		this.numerollamadas = numerollamadas;
		this.tiempototalllamadas = tiempoTotalllamadas;
	}
	
	//Métodos getter y setter para obtener y asignar los valores de los atributos
	public int getNumerollamadas() {
		return numerollamadas;
	}

	public void setNumerollamadas(int numerollamadas) {
		this.numerollamadas = numerollamadas;
	}

	public double getTiempototalllamadas() {
		return tiempototalllamadas;
	}

	public void setTiempototalllamadas(double tiempototalllamadas) {
		this.tiempototalllamadas = tiempototalllamadas;
	}
	
	//Método para obtener toda la información por consola de la clase Empleado y Administrativo	
	public void getDatosadm() {
		getDatosemplado();
		System.out.println( "Numero de llamadas: " +getNumerollamadas()+
	   			  "\nTiempo total de llamadas: " +getTiempototalllamadas());
		System.out.println();
	}

}
