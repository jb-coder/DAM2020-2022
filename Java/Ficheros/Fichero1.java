/*
 * contar el número de vocales, consonantes y numeros que hay en un 
 * fichero pasado por teclado(su ruta)
 */
package Ficheros;
import java.io.*;
import javax.swing.JOptionPane;


public class Fichero1 {

	public static void main(String[] args) throws IOException{
		
		String ruta=JOptionPane.showInputDialog(null,"Inserta la ruta del fichero","Insercion",JOptionPane.INFORMATION_MESSAGE);
		int contadorv=0;
		int contadorc=0;
		int contadorn=0;
		
		try(FileReader rd=new FileReader(ruta)) {
			
			int caracter;
			int vocales[]= {65,69,73,79,85,97,101,105,111,117};
			
			
			while((caracter=rd.read())!=caracter) {
				if(caracter>=48 && caracter<=57){
					contadorn++;
				} else if((caracter>=65 && caracter<=90)  ||
						(caracter>=97 && caracter<=122)){
					boolean esVocal=false;
					
					for(int i=0;i<vocales.length&& !esVocal;i++) {
						if(caracter==vocales[i]) {
							esVocal=true;
						}
					}
					
				if(esVocal) {
					contadorv++;
				}else{
					contadorc++;
				}
				}
			}
			
		}catch (IOException e){
			System.out.println("Error");
        }
		
		System.out.println("Hay "+contadorv+" vocales");
		System.out.println("Hay "+contadorc+" consonantes");
		System.out.println("Hay "+contadorn+" numeros");
		
	}

}
