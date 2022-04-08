package Arrays;
//Crear un array de numeros invertir los vlores.
//El primero en el final, el final en el primero y asi con todos
import java.util.Arrays;

public class Array6 {
    public static void main (String[] args) {
        
        int nums[] = {1,2,3,4,5};
        int aux[]=new int[nums.length];
        
        for(int i=nums.length-1, j= 0;i>=0;j++,i--){
            aux[j] = nums[i];
            System.out.println(aux[j]);
        }
        
        System.out.println(Arrays.toString(aux));
    }
}
