/*
4. En el archivo tres.java, realice un programa que lea de un archivo datos.txt
los datos de un directorio telefónico y los muestre por pantalla.
*/
import java.io.*;

public class Tres {
	public static void main(String[] args) throws IOException {
		try {
			
			//Objeto para leer el archivo datos.txt codificado en UTF-8
			BufferedReader bf = new BufferedReader(new InputStreamReader (new FileInputStream ("C:\\EjerciciosStreams\\datos.txt"),"UTF-8"));
			
			//String donde se almacenara el contenido de datos.txt
			String contenido ="";
			//Variable para recorrer cada caracter de datos.txt
			int c;
			
			//Bucle que ira recorriendo cada caracter de datos.txt, -1 es el ultimo byte del archivo
			while ((c = bf.read())!=-1) {
				contenido+=(char)c;
			}
			System.out.println(contenido);
			
			bf.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
