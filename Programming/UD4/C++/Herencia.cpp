#include<iostream>
#include <stdlib.h>
using namespace std;

class Empleado {
	protected:  //Atributos
		float sueldo; //Se estable el modo de acceso protegido en este atributo para luego poder utilizarlo desde la clase hija
	private:
		string nombre;
	public:  //Métodos
		Empleado(float,string);
		void getSueldo();
		void getNombre();
		void getEmpleado();
};

class Informatico : public Empleado { //Se crea la herencia de la clase padre Empleado
	private:
		int plus;
		string categoria;
	public:
		Informatico(float,string,int,string);
		void getInformatico();
};
//Método constructor clase Empleado
Empleado::Empleado(float _sueldo,string _nombre) {
   	sueldo = _sueldo;
   	nombre = _nombre;
}
//Método constructor clase informatico junto con la clase Empleado
Informatico::Informatico(float _sueldo,string _nombre,int _plus,string _categoria) : Empleado (_sueldo,_nombre){
	plus = _plus;
	categoria = _categoria;
}
//Método para obtener sueldo
void Empleado::getSueldo() {
   cout<<"Mi sueldo es "<<sueldo<< "."<<endl;
}
//Método para obtener nombre
void Empleado::getNombre() {
   cout<<"Mi nombre es "<<nombre<< "."<<endl;
}		
//Método para mostrar todo de la clase Empleado	
void Empleado::getEmpleado() {
    cout<< "Nombre: "<<nombre<<endl;
    cout<<"Sueldo base: "<<sueldo<< " Euros."<<endl;
}	
//Método para obtener de todo de la clase Informatico y empleado
void Informatico::getInformatico() {
	getEmpleado();
	cout<<"Plus: "<<plus<<" Euros."<<endl;
	cout<<"Sueldo total " <<sueldo+plus<< " Euros."<<endl; //Utilizamos el operado aritmético "+" para calcular la suma de sueldo y plus
	cout<<"Categoria: "<<categoria<<endl<<endl;
}
	
int main () {
	//Creamos el objeto
	Informatico i1 = Informatico(1324.52,"Javier",125,"Junior"); 
	Informatico i2 = Informatico(1324.52,"Marta",725,"Senior");
    i1.getInformatico();
    i2.getInformatico();
    system("pause");
    return 0;
}
