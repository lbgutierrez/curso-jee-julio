package cl.ibm.persona.organos;

public class Pulmon extends Organo {

	public Pulmon( Float frecuencia, boolean estado ) {
		
		super( frecuencia, estado );

	}

	@Override
	public void run() {
		long init = System.currentTimeMillis() + (long)( 1000 * frecuencia );
		while ( estado ) {
			if ( System.currentTimeMillis() > init ) {
				System.out.println("RESPIRA");
				init = System.currentTimeMillis() + (long)( 1000 * frecuencia );
			}
		}
	}

}
