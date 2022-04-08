package Arrays;
//Dada una frase que nos proporciona el usuario.
//Pasarlo a un array de char.
import java.util.Scanner;

public class Array7 {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Inserte la frase que desea convertir a array");
        String frase=in.nextLine();
        
        char caracteres[]=new char[frase.length()];
        
        for(int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
            
        }
    }
}