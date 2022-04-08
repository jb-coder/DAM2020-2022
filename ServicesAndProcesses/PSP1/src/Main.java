public class Main {

	public static void main(String[] args) {
		
		Aforo_centroComercial ac1 = new Aforo_centroComercial();
		Aforo_centroComercial ac2 = new Aforo_centroComercial();
		
		Thread hilo_01 = new Thread(ac1);
		Thread hilo_02 = new Thread(ac2);

		hilo_01.start();
		hilo_02.start();

	}
}