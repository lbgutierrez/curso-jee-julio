package cl.ibm.persona;

import cl.ibm.persona.organos.Corazon;
import cl.ibm.persona.organos.Organo;
import cl.ibm.persona.organos.Pulmon;

public class Persona {
	
	Organo corazon = null;
	Organo pulmon = null;
	
	public Persona() {
		
		this.corazon = new Corazon( 1f, true );
		this.pulmon = new Pulmon( 4f, true );
	
	}
	
	public void nacer() {
		Thread tCorazon = new Thread( corazon );
		tCorazon.setName("Hilo-Corazon");
		tCorazon.start();
		
		Thread tPulmon = new Thread( pulmon );
		tPulmon.setName("Hilo-Pulmon");
		tPulmon.start();
	}
	
	public void correr() {
		corazon.setFrecuencia(0.5f);
		pulmon.setFrecuencia(2f);
	}
	
	public void morir() {
		corazon.setEstado( false );
		pulmon.setEstado( false );
	}
	
}
