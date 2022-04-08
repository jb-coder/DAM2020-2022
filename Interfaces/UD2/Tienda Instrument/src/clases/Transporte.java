package clases;

public class Transporte {
	
	String transporte;
	
	public Transporte(String transporte) {
		this.transporte = transporte;
	}

	public String getTransporte() {
		return transporte;
	}

	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	
	@Override
	public String toString() {
		return transporte;
	}
}