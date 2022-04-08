package Arrays;
//Array que contenga las letras del abecedario en mayusculas y que nos permita
//ir cogiendo letras de sus posiciones hasta que insertemos un -1 (si no esta
//en el array se vuelve a pedir
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        //26 son las letras del abecedario
        char abecedario[] = new char[26];
        //de 65 a 90 son los codigos ascii del abecedario
        for(int i = 65,indice=0;i<91;i++,indice++) {
 
            abecedario[indice] = (char) i;
            System.out.println(abecedario[indice]);
        }
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserte un numero");
        int num = in.nextInt();
        String cadena="";
        
        while(num!=-1){
            if(num>=0 && num<abecedario.length){
                
                cadena+=abecedario[num];
                
            } else {
                System.out.println("Numero no valido, inserte un numero valido");
            }
            num = in.nextInt();
        }
        System.out.println("La cadena resultante es "+cadena);
    }
}