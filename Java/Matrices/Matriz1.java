package Matrices;

//Crear matriz 3x3 con los numeros del 1 al 9 mostrar en pantalla
//Como aparecen en la matriz
public class Matriz1 {
    public static void main(String[] args){
        int filas = 3;
        int columnas = 3;
        int matriz[][]=new int[filas][columnas];
        int contador = 1;
        
        // i = filas, j = columnas
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]= contador;
                contador ++;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        /*
        for(int f=0;f<filas;f++) {
            for(int c=0;c<columnas;c++){
            matriz[f][c] = contador;
            contador++;
            System.out.print("["+matriz[f][c]+"]");
            }
        System.out.println("");
        }
        */
    }
    
}
