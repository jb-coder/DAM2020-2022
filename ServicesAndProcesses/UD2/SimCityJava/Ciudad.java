
public class Ciudad extends Thread{
	//Caracteristicas
	String nombre="CIUDAD";
	int poblacionInicial=100;
	int poblacionActual=poblacionInicial;
	AlmacenComida aComida;

	public Ciudad(String nombre, AlmacenComida aComida) {
		this.nombre=nombre;
		this.aComida=aComida;
	}
		
	//COMPLETADO*******************************************
	public void run() {
		try {
			while(poblacionActual>0) {
				//De forma aleatoria nacen y mueren habitantes. Adem�s lo hacen de una forma en tiempo tambi�n aleatoria
				sleep((int) Math.floor(Math.random()*100)); //Esperamos un tiempo aleatorio
				int nacimientos=(int) Math.floor(Math.random()*5); //Nacen un numero aleatorio entre 0 y 5
				System.out.println("["+this.nombre+"] Ha tenido "+nacimientos+" nacimientos");
				poblacionActual=poblacionActual+nacimientos;
				//Se solicita la comida para la poblaci�n actual
				boolean hayComida=this.aComida.solicitarComida(poblacionActual,this.nombre);
				if (!hayComida) {
					
					//COMPLETADO*******************************************
					//Esperamos un tiempo aleatorio
					Thread.sleep((long) Math.floor(Math.random()*5));
					
					//COMPLETADO*******************************************
					//Mueren un numero aleatorio entre 0 y 10
					int muertes=(int) Math.floor(Math.random()*10);
					
					System.out.println("["+this.nombre+"] Ha tenido "+muertes+" muertes");
					
					//COMPLETADO*******************************************
					//Restamos las muertes
					poblacionActual-=muertes;
				}
			}
			System.out.println("["+this.nombre+"] HA DESAPARECIDO");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
