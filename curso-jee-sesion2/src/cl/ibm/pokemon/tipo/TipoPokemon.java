package cl.ibm.pokemon.tipo;

public class TipoPokemon {
	
	private String nombre;
	private TipoPokemon debilidad;
	private Integer factorDanio;
	
	public TipoPokemon( String nombre, TipoPokemon debilidad, Integer factorDanio ) {
		super();
		this.nombre = nombre;
		this.debilidad = debilidad;
		this.factorDanio = factorDanio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPokemon getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(TipoPokemon debilidad) {
		this.debilidad = debilidad;
	}

	public Integer getFactorDanio() {
		return factorDanio;
	}

	public void setFactorDanio(Integer factorDanio) {
		this.factorDanio = factorDanio;
	}
	
}
