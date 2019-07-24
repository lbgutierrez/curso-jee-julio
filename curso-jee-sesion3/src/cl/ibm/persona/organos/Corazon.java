package cl.ibm.persona.organos;

public class Corazon extends Organo {

	public Corazon( Float frecuencia, boolean estado ) {

		super( frecuencia, estado );
		
	}

	@Override
	public void run() {
		long init = System.currentTimeMillis() + (long)( 1000 * frecuencia );
		while ( estado ) {	
			if ( System.currentTimeMillis() > init ) {
				System.out.println("LATE");
				init = System.currentTimeMillis() + (long)( 1000 * frecuencia );
			}
		}
	}

}
