/*
5. Realice un programa cuatro.java que lea el archivo datos.txt
y genere un archivo de acceso aleatorio datosAleatorio.txt.
*/
import java.io.*;

public class Cuatro {
	public static void main(String[] args) throws IOException {
					
		try {
			
			FileReader fr = new FileReader ("C:\\EjerciciosStreams\\datos.txt");
			BufferedReader entrada = new BufferedReader(fr);
			
			RandomAccessFile Archivo = new RandomAccessFile("C:\\EjerciciosStreams\\datosAleatorio.txt","rw");

			String c;
			
			while ((c = entrada.readLine())!= null) {
				//con el método writeChars en cada vuelta del bucle va agregando cada caracter al archivo aleatorio
				Archivo.writeChars(c);
				
				//Condicional para comprobar que el archivo se genera correctamente
				if((c=entrada.readLine())==null) {
					System.out.println("El archivo aleatorio se genero correctamente");
				}
			}
			
			Archivo.close();
			fr.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
