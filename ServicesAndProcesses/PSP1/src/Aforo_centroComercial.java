class Aforo_centroComercial implements Runnable {

	//___________________Atributos___________________
	
	private int numAdultosTotales;
	private int numNinyosTotales;
	private int personasTotales;
	private int limiteAfluenciaTotal = 40;
	
	//___________________Constructor___________________
	
	public Aforo_centroComercial() {
	}

	
	
	public void run() {
		
		try {
			//Bucle for con 20 vueltas para que pueda terminar en algun momento
			
			for(int i=0;i<=20;i++) {
				
				//Simulamos el tiempo de entrada de las personas
				Thread.sleep((int) Math.floor(Math.random() * 3000));
			
				//Mostramos la capacidad de personas disponible del centro comercial
				System.out.println("En éste momento pueden entrar " + limiteAfluenciaTotal + " personas.");

	
//_______________________________________Acceso de personas_______________________________________	

				//Simulamos la entrada aleatoria de ninyos y adultos
				numAdultosTotales = (int)Math.floor(Math.random() * 10);
				numNinyosTotales = (int)Math.floor(Math.random() * 10);
				
				//Sumamos en una variable el total de ninyos y adultos
				personasTotales = numAdultosTotales + numNinyosTotales;
				
				
				//Se establece la condición para que no se exceda el aforo maximo
				if ( (limiteAfluenciaTotal - personasTotales) >= 0) {
				
					limiteAfluenciaTotal -= personasTotales;
				
					System.out.println("Entrando " + personasTotales + " personas.");
					System.out.println("Niños: "+numNinyosTotales+" y adultos: "+numAdultosTotales);

				} else {
					//Si las personas que quieren entrar exceden el limite de afluencia total, se quedan a la espera
					System.out.println("Aforo completo, no pueden entrar mas personas");
				}

//_______________________________________Salida de personas_______________________________________			

				Thread.sleep((int) Math.floor(Math.random() *3000));

				System.out.println("En éste momento hay " + (40-limiteAfluenciaTotal) + " personas dentro.");
			
				numAdultosTotales = (int)Math.floor(Math.random() * 10);
				numNinyosTotales = (int)Math.floor(Math.random() * 10);
				
				personasTotales = numAdultosTotales + numNinyosTotales;

				//Si la condicion se cumple se suman las personas que salen al aforo disponible
				if	((limiteAfluenciaTotal + personasTotales) <= 40 ) {

					limiteAfluenciaTotal += personasTotales;
				
					System.out.println("Saliendo " + personasTotales + " personas.");

				//Si quieren salir mas personas de las que hay dentro, entendemos que es el maximo que hay 
				//dentro y restablecemos el aforo 
				} else {
					
					limiteAfluenciaTotal=40;
					System.out.println("Centro cormercial vacio");
				}
				
			}		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}