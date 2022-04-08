package Arrays;
//Dado un array de numeros, indicar si es capicua(si se lee igual por delante) y
//por detras ejemplo 36563
import java.util.Arrays;

public class Array8 {
    public static void main (String[] args) {
        
        int nums[]={9,0,0,9};
        int aux[]=new int[nums.length];
        
        for(int i=nums.length-1, j= 0;i>=0;j++,i--){   
            aux[j]=nums[i];
        }
        
        
        if (Arrays.equals(nums,aux)) {
            System.out.println("El array es capicuo");
        } else {
            System.out.println("El array NO es capicuo");
        }
        
    }
}
