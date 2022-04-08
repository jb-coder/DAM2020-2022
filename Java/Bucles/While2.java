package Bucles;
import java.util.Scanner;
//Aplicación que nos permita insertar numeros hasta que lleguemos a -1
public class While2 {
    public static void main(String [] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = in.nextInt();
        
        int contador=0;
        
        while(num!=-1) {
            
        contador++;
        System.out.println("Introduzca un numero");
        num=in.nextInt();    
        }
       
        System.out.println("Fin del bucle");
    
    }     
}
