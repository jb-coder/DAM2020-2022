package Objetos;
//Crear un clase Libromain que contenga ISBN,TITULO,AUTOR, NUMERO DE PAGINAS
//Crear setter and getter
//Crear el metodo toString() para mostrar la siguiente informacion
//"El libro <su_titulo> con ISBN<su_ISBN> creado por el autor <su_Autor> tiene
// <num_paginas>"
//En el main crear 2 objetos Libromain (con valores que se quieran) y mostrar por pantalla
//indicar cual de los 2 tienen mas paginas

public class Libromain {
    public static void main(String[] args){
        
        Libro libro1 = new Libro(2342345,"La tempestad","Pepito",345);
        Libro libro2 = new Libro(6874257,"La ira de juan","Alfredo",425);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        libro1.setNumpage(1110);
        
        if(libro1.getNumpage()>libro2.getNumpage()){
            System.out.println(libro1.getTitulo()+ " tiene mas paginas");
        } else {
            System.out.println(libro2.getTitulo()+ " tiene mas paginas");    
        }
    }   
}
