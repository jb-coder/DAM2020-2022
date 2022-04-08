package Arrays;
//Array insertando numeros aleatorios entre 0 y 10 y mostrarlos en pantalla

public class Array4 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        
        for(int i = 0;i<=numeros.length;i++) {
            numeros[i] = numeroAleatorio(0,10);
            System.out.println("En la posicion: "+i+" tiene el numero: "
                    +numeros[i]);
        }
        
    }
    
    public static int numeroAleatorio(int minimo, int maximo){
    return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}