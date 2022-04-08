/*
Eliminar los espacios de una frase que indique el usuario
*/
package Cadenas;

import javax.swing.JOptionPane;

public class Cadena2 {
    public static void main(String[] args){
    	
    	String texto= JOptionPane.showInputDialog(null,"Inserte una frase","Espacios",JOptionPane.ERROR_MESSAGE);
    	
        char caracterActual;
        String texto_sin_espacios="";
             
        for(int i=0;i<texto.length();i++){ 
        	
        	caracterActual=texto.charAt(i);
        	
        	if(caracterActual!=' ') {
        		texto_sin_espacios+=caracterActual;
        		
        	}  
        }
        JOptionPane.showMessageDialog(null,texto_sin_espacios,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    	
    }

}
