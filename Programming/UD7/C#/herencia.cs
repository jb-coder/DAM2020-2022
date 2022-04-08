using System;

class ClasePadre
{
    protected int var = 0;

    void Metodo()   // Incrementa en uno de edad del objeto Persona
    {
        var++;
        Console.WriteLine("Resultado de ejecutar metodo con variable incrementada " +var);
    }

}

class subclase : ClasePadre
{
    // Esta clase implementa los miembros de clase que hereda de ClasePadre
}

public static void Main()
{
        //Acceso a los miembros heredados de ClaseBase
        Subclase objeto;
        objeto.Metodo();
        objeto.Metodo();
}
