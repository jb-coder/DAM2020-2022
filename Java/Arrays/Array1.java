package Arrays;
//Array que contenga los números del 1 al 100 y se muestren en pantalla

public class Array1 {
    public static void main(String[] args) {
        
        int[] numeros= new int[100];
        
        for(int i = 0;i<numeros.length;i++){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }
        
    }
}
