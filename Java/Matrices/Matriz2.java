package Matrices;
import java.util.Scanner;
//Crear matriz de 5 filas y columnas que quiera el usuario, rellenar con numeros
//aleatorios del 0 al 10
public class Matriz2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Indique las columnas que va a tener la matriz");
        int columnas=in.nextInt();
        int matriz[][]=new int[5][columnas];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]= numeroAleatorio(0,10);
                System.out.print(matriz[i][j]+" ");
            }
        System.out.println("");
        }
        
    }
    
    public static int numeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
    
}
