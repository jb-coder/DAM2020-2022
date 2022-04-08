/*
2. En el archivo uno.java, realice un programa que compruebe que existe el archivo, 
lo abra en modo escritura y escriba los n�meros del 0-10.
*/
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class Uno {

	public static void main(String[] args) throws IOException {
		
		try {
		//Creamos un objeto de tipo FileWriter para escribir sobre el archivo
		FileWriter fwone = new FileWriter ("C:\\EjerciciosStreams\\uno.java");
		
		//Creamos un objeto de tipo File para comprobar si existe
		File Fichero = new File ("C:\\EjerciciosStreams\\uno.java");
		
		if(Fichero.exists()) {
			
			//Este bucle da 11 vueltas y en cada una escribe la i que se
			//va incrementando en cada vuelta
			for(int i =0; i<=10; i++) {
				fwone.write(i+"\n");
				}
			fwone.close();
			
		} else {
			
			//Si el fichero no existe se crea
			Fichero.createNewFile();
		}
		
		
		}catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
  