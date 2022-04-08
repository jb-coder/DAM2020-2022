package empleados;

public class Principal {
	
	public static void main(String args[]) { //Método main
		//Objetos de las clases Administrativo, Informatico y Contable
		Administrativo Juan = new Administrativo("Juan","Calle pepito lara 3, 29010, Málaga",952654125,"02-12-1995",1234.42,22,54);
		Informatico Antonio = new Informatico("Antonio","Avenida de Austria 5, 29012, Málaga",951857496,"03-10-1986",1452.74,32);
		Contable Alberto = new Contable("Alberto","Calle Manrique 22,29013, Málaga",952123254,"02-04-1974",1342.74,42,56);
		
		//Ejecución de los métodos sobre los objetos
		Juan.getDatosadm();
		Antonio.getDatosinf();
		Alberto.getDatoscont();
	}
}
