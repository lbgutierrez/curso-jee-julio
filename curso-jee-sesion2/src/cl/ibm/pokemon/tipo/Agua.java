package cl.ibm.pokemon.tipo;

import cl.ibm.pokemon.utils.PokemonUtil;

public class Agua extends TipoPokemon {

	public Agua() {
		super( PokemonUtil.TIPO_AGUA, null, null );
	}
	
	public Agua( Integer factorDanio ) {
		super( PokemonUtil.TIPO_AGUA, new Hoja(), factorDanio );
	}

}
