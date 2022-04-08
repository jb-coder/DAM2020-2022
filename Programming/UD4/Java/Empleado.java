package empleados;

public abstract class Empleado { //Superclase abstracta
	//Atributos
	private String nombre;
	private String direccion;
	private int telefono;
	private String fecha_nac;
	private double sueldo;
	//Método constructor
	public Empleado(String nombre, String direccion, int telefono, String fecha_nac, double sueldo) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha_nac = fecha_nac;
		this.sueldo = sueldo;
	}

	//Métodos getter y setter para obtener y asignar los valores de los atributos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	//Método para obtener toda la información por consola de la clase empleado
	public void getDatosemplado() {
		System.out.println("Nombre: " +getNombre()+
	   			  "\nDireccion: " +getDireccion()+
	   			  "\nTelefono: " +getTelefono()+
	   			  "\nFecha de nacimiento: " +getFecha_nac()+
	   			  "\nSueldo: " +getSueldo()+ "€");
		System.out.println();
    }	

}
