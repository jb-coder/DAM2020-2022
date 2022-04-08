public class SeccionCritica {
	
	private static SeccionCritica semaforo;
	private static int a = 1;
	
	private SeccionCritica() {
		
	}
	
	public final static SeccionCritica getInstance() {
		if(semaforo == null) {
			semaforo = new SeccionCritica();
		}
		return semaforo;
	}
	
	public void entrada_seccion_critica() {
		while(!isAvailable()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		a -=1;
		
		valorVariable();
		this.notifyAll();
	}
	
	public void salida_seccion_critica(){
		while(isAvailable()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		a += 1;
		
		valorVariable();
		this.notifyAll();
	}
	
	public synchronized final static boolean isAvailable() {
		return a == 1 ? true : false;
	}
	
	public synchronized final static void valorVariable() {
		System.out.println("Valor de la variable a: "+a);
	}
