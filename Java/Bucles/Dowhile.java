package Bucles;
//Realizar la suma del 1 al numero que le indiquemos (tiene que ser mayor a 1)
import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un numero");
        int num;
        
        do{
        num = sc.nextInt();
        
        if(num<=1) {
            System.out.println("Introduzca un numero correcto");
        }   
        } while (num<=1);
        
        int suma = 0;
        
        for(int i =1;i<=num;i++){
            suma+=i;
            
        }

        System.out.println("La suma es: "+suma);
    }
}
