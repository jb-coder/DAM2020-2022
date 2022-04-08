/*
Contar cuantas vocales tiene una frase que indique el usuario
*/
package Cadenas;
import javax.swing.JOptionPane;

public class Cadena1 {
    public static void main(String[] args){
        String texto=JOptionPane.showInputDialog(null,"Escriba una cadena: ","Insercion",JOptionPane.INFORMATION_MESSAGE);
        texto = texto.toLowerCase();
        
        char vocales[]={'a','e','i','o','u'}; //Array de vocales
        char caracterActual;
        int contadorV=0;
        boolean esVocal=false;
        
        for(int i=0;i<texto.length();i++){ 
        
        	caracterActual=texto.charAt(i);
        	esVocal=false;
        	
        	for(int j=0;j<vocales.length && !esVocal;j++) {
        		
        		if(vocales[j]==caracterActual) {
        			contadorV++;
        			esVocal=true;
        		}
        	}
        	
        }
        JOptionPane.showMessageDialog(null,"La frase tiene "+contadorV+" vocales","Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
