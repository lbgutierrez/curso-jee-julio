package cl.ibm.pokemon.utils;

import cl.ibm.pokemon.tipo.Agua;
import cl.ibm.pokemon.tipo.Fuego;
import cl.ibm.pokemon.tipo.Hoja;
import cl.ibm.pokemon.tipo.TipoPokemon;

public class PokemonUtil {

	public static final String TIPO_HOJA = "Hoja";
	public static final String TIPO_AGUA = "Agua";
	public static final String TIPO_FUEGO = "Fuego";
	
	public String nombreTipoPkmn( TipoPokemon tipo ) {
		
		if ( tipo instanceof Hoja ) {
			return TIPO_HOJA;
		} 
		if ( tipo instanceof Agua ) {
			return TIPO_AGUA;
		}
		if ( tipo instanceof Fuego ) {
			return TIPO_FUEGO;
		}
		
		return null;
		
	}
	
}
