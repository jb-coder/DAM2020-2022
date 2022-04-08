package Objetos;
//Crear un clase Libromain que contenga ISBN,TITULO,AUTOR, NUMERO DE PAGINAS
//Crear setter and getter
//Crear el metodo toString() para mostrar la siguiente informacion
//"El libro <su_titulo> con ISBN<su_ISBN> creado por el autor <su_Autor> tiene
// <num_paginas>"
//En el main crear 2 objetos Libromain (con valores que se quieran) y mostrar por pantalla
//indicar cual de los 2 tienen mas paginas
public class Libro {
    
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numpage;

    public Libro(int ISBN, String Titulo, String Autor, int numpage) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numpage = numpage;
    }

    @Override
    public String toString(){
        return "El libro " +Titulo+ " con ISBN "
                +ISBN+ " creado por el autor "+Autor+ " tiene "
                +numpage+" paginas.";    
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumpage() {
        return numpage;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumpage(int numpage) {
        this.numpage = numpage;
    }
    
    
}
