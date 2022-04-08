package Ficheros;
import java.io.FileWriter;
import java.io.IOException;


public class Filewriter {
    public static void main(String[] args) throws IOException{
        
        try (FileWriter fw=new FileWriter("D:\\holamundo.txt", true);
             FileWriter fw2=new FileWriter("D:\\holamundo.txt", true)){//con true añade mas lineas
            
            fw.write("\nHola mundo!!!");
            
        } catch (IOException ex){
         
        }
    }
}
