package Arrays;
//Array del 1 al 100 que suma y de la media de todos sus valores

public class Array2 {
    public static void main(String[] args) {
        
        int[] numeros= new int[100];
        int suma = 0;
        double media = 0;
        
        for(int i = 0;i<numeros.length;i++){
            numeros[i] = i+1;
            suma+=numeros[i];
        }
        
        System.out.println("La suma es "+suma);
        media=(double)suma/numeros.length;
        System.out.println("La media es "+media);
    }
}