package Funciones;

public class Funciones2 {
    public static void main (String[] args) {
        System.out.println(numFactorial(4));
        System.out.println(numPrimo(7));
    }
    //Función calcular el factorial de un número entero
    public static int numFactorial(int num) {
        
        if(num<0) {
            System.out.println("No se puede calcular el factorial de un negativo");
            return -1;
        }
        
        if(num==0 || num==1){
            return 1;
        }
        int result = num;
        
        for(int i =(num-1);i>1;i--) {
            result*=i;
        }
        
        return result;
    }
    
    //Función para calcular si un numero es primo
    public static boolean numPrimo(int num) {
        if (num<=1) {
            return false;
        }
        
        for(int i=(int)Math.sqrt(num);i>1;i--) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
