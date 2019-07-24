# El problema
Un pokémon (pkmn) tiene un nombre, energía, un tipo y hasta 4 habilidades.

Un tipo de pkmn puede ser de tipo hoja, agua o fuego. Donde agua es débil contra hoja, hoja es débil contra fuego y fuego es débil contra agua. Cada tipo de pkmn tiene un factor de daño que varia según el pkmn.

Las habilidades tienen un nombre y una cantidad de daño que varia en efectividad según el tipo del pkmn rival.

Un pkmn comienza con el 100% de energía y puede disminuir según el daño recibido, si el pokmn tiene debilidad sobre el oponente, el daño se multiplica por el factor de daño indicado según su tipo.

Un pkmn puede atacar, donde el ataque varia su daño según el tipo del pkmn enemigo y la habilidad utilizada, ejemplo si la habilidad es "Placaje", el daño para tipo hoja puede ser 5, para agua puede ser 5 y para fuego puede ser 10.

Para crear un pkmn existirá una fabrica de pokémon donde puede crear un caterpy, un squartle y un charmander.

# Solución propuesta

![alt text](https://raw.githubusercontent.com/lbgutierrez/curso-jee-julio/master/documentacion/ejercicios-resueltos/sesion-1/DC_Pokemon.png)

1. Se implementará una clase denominada Pokemon, cuyos miembros involucran el nombre, el tipo, la energía y una lista de habilidades. Ademas cada pokemon podrá atacar y recibir daño hacia/desde el oponente.

2. Un pokemon puede ser de un tipo específico, representados por las clases Hoja, Agua y Fuego. A su vez, cada tipo tiene una debilidad contra otro tipo de pokemon, por lo tanto si recibe daño de un pokemon rival, del que presenta debilidad, se multiplicará el daño de acuerdo al factor de daño especificado en la super clase (TipoPokemon).

3. Cada pokemon tendra una lista de habilidades, que estan representadas por la clase Habilidad, donde se pueden apreciar sus miembros, los que involucran el nombre, el daño y un factor de ataque dependiendo del tipo que sea el pokemon rival.

4. Finalmente, dispondremos de una clase encargada de fabricar los diferentes tipos de pokemon, representada por la clase PokemonFactory, en esta contaremos con tres metodos, uno para crear un Squirtle, un Charmander y un Caterpy.

