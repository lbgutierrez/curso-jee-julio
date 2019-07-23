import cl.ibm.pokemon.Pokemon;
import cl.ibm.pokemon.factory.PokemonFactory;


public class Main {
	
	public static void main(String[] args) {
		Pokemon caterpy = PokemonFactory.crearCaterpy();
		Pokemon charmander = PokemonFactory.crearCharmander();
		
		System.out.println(caterpy);
		System.out.println("-----");
		
		charmander.atacar(0, caterpy);
		
		System.out.println(caterpy);
	}
	
}
