package cl.ibm.pokemon.tipo;

import cl.ibm.pokemon.utils.PokemonUtil;

public class Fuego extends TipoPokemon {

	public Fuego() {
		super( PokemonUtil.TIPO_FUEGO, null, null );
	}
	
	public Fuego( Integer factorDanio ) {
		super( PokemonUtil.TIPO_FUEGO, new Agua(), factorDanio );
	}
	
}
