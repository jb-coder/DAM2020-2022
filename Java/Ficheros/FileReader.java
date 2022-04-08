package Ficheros;

import java.io.*;

public class FileReader {
    public static void main(String[] args) throws IOException{
        
        String contenido="";
        int c;
        try{
            FileReader fr=new FileReader("/Users/jb/Documents/holamundo.RTF");
           
            while((c=fr.read())!=1){
                contenido+=(char)c;
            }
        
         
        }catch (IOException e){
        }
        
        System.out.println("El contenido del fichero es: "+contenido);
    }
}
