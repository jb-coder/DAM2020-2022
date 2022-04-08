//Subclase de Producto
public class Nuevo extends Producto{
	
	//Metodo Constructor
	
	public Nuevo(String Matricula, String Modelo, String Color) {
		super(Matricula, Modelo, Color);
	}
	
	//Metodo para visualizar la información de los atributos y herencia
	//del metodo creado en la clase Producto
	
	public void mostrarInfoNuevo() {
		mostrarInfoGeneral();
	}
}
