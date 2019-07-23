package cl.ibm.pokemon.factory;

import java.util.HashMap;
import java.util.Map;

import cl.ibm.pokemon.Pokemon;
import cl.ibm.pokemon.habilidad.Habilidad;
import cl.ibm.pokemon.tipo.Agua;
import cl.ibm.pokemon.tipo.Fuego;
import cl.ibm.pokemon.tipo.Hoja;
import cl.ibm.pokemon.tipo.TipoPokemon;
import cl.ibm.pokemon.utils.PokemonUtil;

public class PokemonFactory {

	public static Pokemon crearCaterpy() {
		
		String nombre = "Caterpy";
		Integer energia = 100;
		TipoPokemon tipo = new Hoja(3);
		
		Map<String, Integer> factorAtaque = new HashMap<String, Integer>();
		factorAtaque.put(PokemonUtil.TIPO_HOJA, 2);
		factorAtaque.put(PokemonUtil.TIPO_AGUA, 3);
		factorAtaque.put(PokemonUtil.TIPO_FUEGO, 1);
		Habilidad h1 = new Habilidad("Placaje", 10, factorAtaque);
		
		Habilidad[] habilidades = new Habilidad[4];
		habilidades[0] = h1;
		habilidades[1] = null;
		habilidades[2] = null;
		habilidades[3] = null;
		
		Pokemon caterpy = new Pokemon( nombre, energia, tipo, habilidades );
		
		return caterpy;
		
	}
	
	public static Pokemon crearCharmander() {
		
		String nombre = "Charmander";
		Integer energia = 100;
		TipoPokemon tipo = new Fuego(2);
		
		Map<String, Integer> factorAtaque1 = new HashMap<String, Integer>();
		factorAtaque1.put(PokemonUtil.TIPO_HOJA, 3);
		factorAtaque1.put(PokemonUtil.TIPO_AGUA, 1);
		factorAtaque1.put(PokemonUtil.TIPO_FUEGO, 2);
		Habilidad h1 = new Habilidad("Placaje", 10, factorAtaque1);
		
		Map<String, Integer> factorAtaque2 = new HashMap<String, Integer>();
		factorAtaque2.put(PokemonUtil.TIPO_HOJA, 4);
		factorAtaque2.put(PokemonUtil.TIPO_AGUA, 1);
		factorAtaque2.put(PokemonUtil.TIPO_FUEGO, 2);
		Habilidad h2 = new Habilidad("Lanza LLamas", 10, factorAtaque2);
		
		Habilidad[] habilidades = new Habilidad[4];
		habilidades[0] = h1;
		habilidades[1] = h2;
		habilidades[2] = null;
		habilidades[3] = null;
		
		Pokemon charmander = new Pokemon( nombre, energia, tipo, habilidades );
		
		return charmander;
		
	}
	
	public static Pokemon crearSquirtle() {
		
		String nombre = "Squirtle";
		Integer energia = 100;
		TipoPokemon tipo = new Agua(4);
		
		Map<String, Integer> factorAtaque1 = new HashMap<String, Integer>();
		factorAtaque1.put(PokemonUtil.TIPO_HOJA, 3);
		factorAtaque1.put(PokemonUtil.TIPO_AGUA, 1);
		factorAtaque1.put(PokemonUtil.TIPO_FUEGO, 2);
		Habilidad h1 = new Habilidad("Placaje", 10, factorAtaque1);
		
		Map<String, Integer> factorAtaque2 = new HashMap<String, Integer>();
		factorAtaque2.put(PokemonUtil.TIPO_HOJA, 3);
		factorAtaque2.put(PokemonUtil.TIPO_AGUA, 1);
		factorAtaque2.put(PokemonUtil.TIPO_FUEGO, 2);
		Habilidad h2 = new Habilidad("Lanza Agua", 10, factorAtaque2);
		
		Habilidad[] habilidades = new Habilidad[4];
		habilidades[0] = h1;
		habilidades[1] = h2;
		habilidades[2] = null;
		habilidades[3] = null;
		
		Pokemon squirtle = new Pokemon( nombre, energia, tipo, habilidades );
		
		return squirtle;
		
	}
	
}
