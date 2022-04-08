
public class Juego {

	public static void main(String[] args) {
		//Creamos el Almacen
		AlmacenComida almacen=new AlmacenComida();
		Thread aComida=new Thread(almacen);
		aComida.start();
		//Creamos nuestra primera ciudad
		Ciudad c1=new Ciudad("Madrid", almacen);
		Ciudad c2=new Ciudad("Barcelona", almacen);
		
		
		//COMPLETADO*******************************************
		c1.start();
		c2.start();

	}

}
