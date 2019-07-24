package cl.ibm.persona;

public class StartPersona {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.nacer();
		
		long init = System.currentTimeMillis();
		while (System.currentTimeMillis() < init+10000 ) {
			//espera 10 segundos
		}
		
		System.out.println("Correr");
		persona.correr();
		
		init = System.currentTimeMillis();
		while (System.currentTimeMillis() < init+10000 ) {
			//espera 10 segundos
		}
		
		
		persona.morir();
		System.out.println("finaliza programa");
	}

}
