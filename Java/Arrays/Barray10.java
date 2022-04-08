package Arrays;
import java.util.Arrays;
//Crear dos arrays, rellenar uno con numeros y copiarlo al otro usando CopyOf
public class Barray10 {
    public static void main(String[] args){
        int array1[]=new int[10];
        Arrays.fill(array1,4);
        int array2[]=Arrays.copyOfRange(array1,2,9);
        
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        
    }
}
