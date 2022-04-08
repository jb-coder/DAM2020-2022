#include<iostream>
using namespace std;
//Superclase de la que heredara sus atributos y métodos
class ClasePadre
{
	//Variable de tipo protegido que solo se podran acceder a ellas
	//a traves de las subclases
    protected:
    int var = 0;
    public:
    void Metodo(void)
    {
        var++;
        cout<<"Resultado de ejecutar metodo con variable incrementada "<<var<<endl;
    }
};

//Sintaxis para indicar que Subclase hereda de ClasePadre
class Subclase : public ClasePadre  
{
/* Esta clase implementa los miembros de clase que hereda de ClasePadre */
};

int main()
{
    Subclase objeto;
    
    /* Acceso a los miembros heredados de Subclase */
    objeto.Metodo(); 
    objeto.Metodo();
    return 0;
}
