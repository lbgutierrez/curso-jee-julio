package cl.ibm.pokemon;

import java.util.Arrays;

import cl.ibm.pokemon.habilidad.Habilidad;
import cl.ibm.pokemon.tipo.TipoPokemon;

public class Pokemon {

	private String nombre;
	private Integer energia;
	private TipoPokemon tipo;
	private Habilidad[] habilidades;
	
	public Pokemon(String nombre, Integer energia, TipoPokemon tipo,
			Habilidad[] habilidades) {
		
		super();
		this.nombre = nombre;
		this.energia = energia;
		this.tipo = tipo;
		this.habilidades = habilidades;
		
	}
	
	public void danioRecibido( Pokemon enemigo, Integer danio ) {
		
		TipoPokemon tipoDebilidad = tipo.getDebilidad();
		String tipoDebilidadDesc = tipoDebilidad.getNombre();
				
		TipoPokemon tipoEn = enemigo.getTipo();
		String tipoDescEn = tipoEn.getNombre();
				
		if ( tipoDebilidadDesc.equals( tipoDescEn ) ) {
			danio *= tipo.getFactorDanio();
		}
		
		energia -= danio;
		
	}
	
	public void atacar( Integer habIndice, Pokemon enemigo ) {
		
		TipoPokemon tipoEnemigo = enemigo.getTipo();
		Habilidad habUsar = habilidades[habIndice];
		
		Integer factorAtaque = habUsar.getFactorAtaque( tipoEnemigo.getNombre() );
		Integer totalDanio = habUsar.getDanio() * factorAtaque;
		
		enemigo.danioRecibido( this, totalDanio );
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public Habilidad[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidad[] habilidades) {
		this.habilidades = habilidades;
	}
	
	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", energia=" + energia + ", tipo="
				+ tipo + ", habilidades=" + Arrays.toString(habilidades) + "]";
	}
	
}
