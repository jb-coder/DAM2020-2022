package main;

import server.Server;
import client.ClienteRecaudacion;

public class Principal {

	public static void main(String[] args) {
		Server sv = new Server();
		ClienteRecaudacion sc = new ClienteRecaudacion();
		
		
		Thread Servidor = new Thread(sv);
		Thread Client1 = new Thread(sc);
		Thread Client2 = new Thread(sc);

		
		Servidor.start();
		Client1.start();
		Client2.start();

		
		
	}
}