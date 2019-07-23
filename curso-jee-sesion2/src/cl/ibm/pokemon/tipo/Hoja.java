package cl.ibm.pokemon.tipo;

import cl.ibm.pokemon.utils.PokemonUtil;

public class Hoja extends TipoPokemon {

	public Hoja() {
		super( PokemonUtil.TIPO_HOJA, null, null );
	}
	
	public Hoja( Integer factorDanio ) {
		super( PokemonUtil.TIPO_HOJA, new Fuego(), factorDanio );
	}
	
}
