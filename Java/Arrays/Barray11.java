package Arrays;
import java.util.Arrays;
//Indica si dos arrays creados por ti son iguales con Equals de Arrays
public class Barray11 {
    public static void main(String[] args){
        int Array1[]=new int[3];
        int Array2[]=new int[3];
        
        System.out.println(Arrays.equals(Array1, Array2));
        
        if(Arrays.equals(Array1, Array2)){
            System.out.println("El array es igual");
        }else {
            System.out.println("El array no es igual");
        }
        
    }
}
