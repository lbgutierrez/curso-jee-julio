package cl.ibm.pokemon.habilidad;

import java.util.Map;

import cl.ibm.pokemon.tipo.TipoPokemon;

public class Habilidad {

	private String nombre;
	private Integer danio;
	private Map<String, Integer> factorAtaque;
	
	public Habilidad(String nombre, Integer danio,
			Map<String, Integer> factorAtaque) {
		super();
		this.nombre = nombre;
		this.danio = danio;
		this.factorAtaque = factorAtaque;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDanio() {
		return danio;
	}

	public void setDanio(Integer danio) {
		this.danio = danio;
	}

	public Map<String, Integer> getFactorAtaque() {
		return factorAtaque;
	}

	public void setFactorAtaque(Map<String, Integer> factorAtaque) {
		this.factorAtaque = factorAtaque;
	}
	
	public Integer getFactorAtaque( String nombreTipo ) {
		return this.factorAtaque.get( nombreTipo );
	}
	
}
