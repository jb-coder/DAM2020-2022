#include<iostream>
using namespace std;

class Composicion
{
    private:
    int num;
    
    public:
    void setNum(int x){
		num = x;
	}
    int getNum(){
		return num;
	}
};

//La clase ClaseUno adquiere por composición los miembros de la clase Composicion
class ClaseUno
{
    private:
    Composicion unObj;
    
    public:
    void setNum(int x){
		unObj.setNum(x);
	}
    int getNum(){
		return unObj.getNum();
	}
    
};

// Mismo caso aquí
class ClaseDos
{
    private:
    ClaseUno otroObj;
    public:
    void setNum(int x){
		otroObj.setNum(x);
	}
    int getNum(){
		return otroObj.getNum();
	}
    
};
//Metodo principal donde instanciamos los objetos
int main()
{
    ClaseUno objetoUno; 
    ClaseDos objetoDos;
    
    //Acceso al miembro num de las clases ClaseUno y ClaseDos
    objetoUno.setNum(5); 
    objetoDos.setNum(25);
    cout<<objetoUno.getNum()<<endl;
    cout<<objetoDos.getNum()<<endl;
    
    return 0;
}
