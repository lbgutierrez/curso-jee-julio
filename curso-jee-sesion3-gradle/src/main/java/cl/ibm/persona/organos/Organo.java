package cl.ibm.persona.organos;

public abstract class Organo implements Runnable {

	protected Float frecuencia = null;
	protected boolean estado = false;
	
	public Organo( Float frecuencia, boolean estado ) {
		
		this.frecuencia = frecuencia;
		this.estado = estado;
		
	}

	public Float getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Float frecuencia) {
		this.frecuencia = frecuencia;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
