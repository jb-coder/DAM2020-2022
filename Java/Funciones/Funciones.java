package Funciones;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        int num1 =1;
        int num2 =2;
        int num = 5;
        char c = 'a';
        int min = 1;
        int max = 1000;
        
        
        System.out.println("El resultado es: "+sumaDosnumeros(num1,num2));
        
        if(mayorQue(num)) {
            System.out.println("El resultado es mayor que 0 ");
        
        } else {
            System.out.println("El resultado es menor que 0 ");
        }
        System.out.println("El caracter "+c+ " tiene asociado el codigo "+numeroAscii(c));
        System.out.println(numeroAleatorio(min,max));
        
    }
    
    //Metodo que devuelve Hola mundo!!!
    public static void holaMundo() {
            System.out.println("Hola mundo!!!");
        }
    
    //Función que sume 2 numeros enteros
    public static int sumaDosnumeros(int a,int b) {
        return a+b;
    }
    
    //Función que indique si un número es mayor o menor que cero
    public static boolean mayorQue(int a) {
        return a>0;
    }
    //Función que devuelva un número ASCII
    public static int numeroAscii(char caracter){
        return (int)caracter;
    }
    
    //Función numero aleatorio entre dos numeros enteros que le demos
    public static int numeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}