package client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteRecaudacion implements Runnable {
	
	 int port = 6000;
	 String hostname = "localhost";
	 
	 public ClienteRecaudacion() {
		 
	 }
	 
	 //Metodo que que devuelve un numero aleatorio de 0 a 10 como String
	 public String envioRecaudacion() {
		
		int numAleatorio = (int)Math.floor(Math.random() * 10);
		String recaudacion = String.valueOf(numAleatorio);
		 
		return recaudacion;
		 
	 }
	 
	 @Override
	 public void run() {
		 
		 
		 try(Socket cliente = new Socket(hostname,port)){
			 System.out.println("[CLIENTE] Conexion correcta con el servidor");
			
			 	//Canal de salida al servidor
				OutputStream out= cliente.getOutputStream();
				PrintWriter writer=new PrintWriter(out,true);
				
				
				System.out.println("[CLIENTE] Enviando recaudacion");
				writer.println(envioRecaudacion());
				
			 
			 
			 cliente.close();
		 } catch(IOException ex) {
			 
		 }
		 
		 
	 }

}
