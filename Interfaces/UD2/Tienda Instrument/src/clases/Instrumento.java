package clases;

public class Instrumento {
	
	private String tipo;
	private int numIntru;
	private float peso;
	private String fecha;
	Transporte transporte;
	private String observaciones;
	
	public Instrumento(String tipo, int numIntru, float peso, String fecha, Transporte transporte,String observaciones) {
		this.tipo = tipo;
		this.numIntru = numIntru;
		this.peso = peso;
		this.fecha = fecha;
		this.transporte = transporte;
		this.observaciones = observaciones;
	}
	
	public Instrumento() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumIntru() {
		return numIntru;
	}

	public void setNumIntru(int numIntru) {
		this.numIntru = numIntru;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	@Override
	public String toString() {
		return tipo +", "+numIntru+", "+peso+", "+fecha+", "+transporte+", "+observaciones;
	}
	
}
