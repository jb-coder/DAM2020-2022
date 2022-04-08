package Arrays;
import java.util.Scanner;
//Array que de una longitud que diga el usuario 
//y que permita insertar numeros entre 0 y 10

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cuantas posiciones quiere que contenga el array");
        int longitud = in.nextInt();
        int[] numeros = new int[longitud];
        int num;
        for(int i =0;i<numeros.length;i++){
            System.out.println("Inserte un numero en la posicion " +i);

            do{
                num=in.nextInt();
                
                if(!(num>=0 && num<=10)){
                    System.out.println("Error, inserte del 1 al 10");
                }
                
            }while(!(num>=0 && num<=10));
            
            numeros[i]=num; 
        }
        
        System.out.println("Numeros elegidos por el usuario");
        for(int i =0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }      
    }
}