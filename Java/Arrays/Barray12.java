package Arrays;
import java.util.Arrays;
//Ordena un array de números con Sort de Arrays:
public class Barray12 {
    public static void main(String[] args){
        int array[]=new int[5];
      
        array[0]=6;
        array[1]=3;
        array[2]=9;
        array[3]=4;
        array[4]=1;
      
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
