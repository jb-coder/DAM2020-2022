package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{

	int port = 6000;
	
	
	public Server() {
	}
	
	
	@Override
	public void run() {
		
		try(ServerSocket server = new ServerSocket(port)){
			//Espera de las conexiones de los posibles clientes
			while(true) {
				Socket socket = server.accept();
				System.out.println("[SERVER] Entrando en server");
				
				
				//Capturamos el socket de entrada
				InputStream in=socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				 
				//Leeremos de la entrada
				String ClientReader = reader.readLine();
			
				int conversion = Integer.parseInt(ClientReader);
				int Totalrecaudacion=+conversion;
						
						
				System.out.println("[SERVER] Se recaudo "+ClientReader+ " € en esta transaccion");
				System.out.println("[SERVER] Total recaudado "+Totalrecaudacion+ " €");
			}
			
			
		} catch(IOException ex) {
			System.out.println("[SERVER] Error");
		}

		
		
	}
}
