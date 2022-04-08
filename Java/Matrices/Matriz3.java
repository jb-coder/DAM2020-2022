package Matrices;
import java.util.Scanner;
//Crear dos matrices de nxn y sumar sus valores, los resultados se deben
//almacenar en otra matriz. Los valores y la longitud, seran insertados por el
//usuario. Mostrar las matrices originales y el resultado
public class Matriz3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Indique la longitud de la matriz");
        int longitud=in.nextInt();
        
        int matriz1[][]=new int[longitud][longitud];
        int matriz2[][]=new int[longitud][longitud];
        int result[][]=new int[longitud][longitud];
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                System.out.println("Escriba el valor para la posicion "+i+ " y columna "+j);
                matriz1[i][j]=in.nextInt();
                System.out.println("Escriba el valor para la posicion "+i+ " y columna "+j);                
                matriz2[i][j]=in.nextInt();
                             
                
                result[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        
        muestraMatriz(matriz1);
        muestraMatriz(matriz2);
        muestraMatriz(result);
    }
    public static void muestraMatriz(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
        System.out.println(" ");
        }
    }
}
