package Arrays;
import java.util.Arrays;
//Rellenas un array de numeros (int) usando el metodo fill arays
public class Array9 {
    public static void main(String[] args){
        int array[]=new int[10];
        Arrays.fill(array,20); //(array creado,numero para rellenar array)
        Arrays.fill(array,3,array.length,-1); //(array creado, posicion donde empieza,posicion acaba,numero para rellenar)
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }
    
}
