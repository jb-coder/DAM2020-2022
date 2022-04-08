package Bucles;
//Mostrar del 1 al 100 y que sean divisibles entre 2 y 3
public class FormasIf {
    public static void main(String[] args) {
        
        for(int i=1;i<=100; i++) {
            if(i%2==0 || i%3==0) {
            System.out.println(i);
        }
        }
    }
    
}
