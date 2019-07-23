# Julio 2019 - Curso JEE
Este curso tiene como objetivo, hacer una induccion a la codificación en lenguaje java, con un enfoque practico hacia el desarrollo sobre plataformas web. El curso comienza con un repaso de los conceptos generales del lenguaje, modelado de soluciones orientadas a objeto, uso de repositorios de codigo fuente, creacion de librerias y finalmente despliegue de solucion web en servidor cloud.

[Sesión 1](https://github.com/lbgutierrez/curso-jee-julio/blob/master/documentacion/presentaciones/Capacitaci%C3%B3n%20JEE%20-%20Sesi%C3%B3n%201.pptx?raw=true) - 22/07/2019
  - Introducción al curso
  - Acerca de java
  - Herramientas de desarrollo
  - Ambientar entorno de trabajo
  - Como usar git

[Sesión 2](https://github.com/lbgutierrez/curso-jee-julio/blob/master/documentacion/presentaciones/Capacitaci%C3%B3n%20JEE%20-%20Sesi%C3%B3n%202.pptx?raw=true) - 23/07/2019
  - Conceptos Generales
  - Clases, herencia, interfaces
  - Modificadores de acceso
  - Variables primitivas y variables por referencia
  - Arreglos
  - Operadores
  - Control de flujo

**Asistentes**

[Grupo A](https://github.com/benjaranedad/Proyecto-Pokemon)
  - [Alan Caro](https://github.com/Alancaro2)
  - [Benjamin Araneda](https://github.com/benjaranedad)
  - Luis Reyes
  - [Miguel Valdebenito](https://github.com/caiido)

[Grupo B](https://github.com/favc5/curso-jee-sesion2)
  - Cristian Nuñez
  - [Emanuel Córdova](https://github.com/EmanuelCordova)
  - [Fabian Valdés](https://github.com/favc5)

[Grupo C](https://github.com/BastianHor/ProyectoPokemon)
  - [Bastian Lagos](https://github.com/BastianHor)
  - David Rozas
  - Juan Cayupul

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
