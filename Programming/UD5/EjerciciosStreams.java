/*
1. Realice un programa que cree un directorio llamado EjerciciosStreams en la 
unidad C de nuestro disco duro (si no existe) y dentro tres ficheros denominados 
uno.java, dos.java y tres.java
*/
import java.io.IOException;
import java.io.File;

public class EjerciciosStreams {
	
	public static void main(String[] args) throws IOException {
		//Instanciamos el Objeto tipo file y ejecutamos el m�todo para crear el directorio
		File directorio = new File("C:\\EjerciciosStreams\\");
		if(!directorio.exists()) {
			
			directorio.mkdir();
			System.out.println("Creando directorio....");
				
		} else {
			System.out.println("El directorio ya existe");
		}
		
		try {
			
			//Instanciamos los objetos tipo File
			File fwone = new File ("C:\\EjerciciosStreams\\uno.java");
			File fwtwo = new File ("C:\\EjerciciosStreams\\dos.java");
			File fwthree = new File ("C:\\EjerciciosStreams\\tres.java");
			
			//Con el metodo "createNewFile" se crean los archivos
			fwone.createNewFile();
			fwtwo.createNewFile();
			fwthree.createNewFile();
				
			
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
