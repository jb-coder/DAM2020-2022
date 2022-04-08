/*
3. En el archivo dos.java, realice un programa que guarde el c�lculo 
del �rea de un tri�ngulo sabiendo que los datos se reciben por teclado.
*/
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Dos {
	public static void main(String[] args) throws IOException {
		
		try {
		//Creamos el archivo con Filewriter
		FileWriter fwtwo = new FileWriter ("C:\\EjerciciosStreams\\dos.java");
		//Solicitamos al usuario los datos que se guardaran en las variables
		//h y b con el Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("****Calculo del area de un triangulo****");
		System.out.println("*****Indique la altura del triangulo****");
		float h = in.nextFloat();
		
		System.out.println("Indique la base del triangulo");
		float b = in.nextFloat();
		
		//Resultado del cálculo del area
		float result = (b*h)/2;
		//Mostramos el resultado en la consola
		System.out.println("El resultado es: "+result);
		
		//Convertimos el resultado de tipo float a String para poder
		//volcarlo al fichero que creamos(dos.java)
		String resultString = String.valueOf(result);
		fwtwo.write(resultString);
		
		fwtwo.close();
		in.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
