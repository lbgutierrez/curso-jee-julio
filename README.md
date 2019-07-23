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


# El problema
Un pokémon (pkmn) tiene un nombre, energía, un tipo y hasta 4 habilidades.

Un tipo de pkmn puede ser de tipo hoja, agua o fuego. Donde agua es débil contra hoja, hoja es débil contra fuego y fuego es débil contra agua. Cada tipo de pkmn tiene un factor de daño que varia según el pkmn.

Las habilidades tienen un nombre y una cantidad de daño que varia en efectividad según el tipo del pkmn rival.

Un pkmn comienza con el 100% de energía y puede disminuir según el daño recibido, si el pokmn tiene debilidad sobre el oponente, el daño se multiplica por el factor de daño indicado según su tipo.

Un pkmn puede atacar, donde el ataque varia su daño según el tipo del pkmn enemigo y la habilidad utilizada, ejemplo si la habilidad es "Placaje", el daño para tipo hoja puede ser 5, para agua puede ser 5 y para fuego puede ser 10.

Para crear un pkmn existirá una fabrica de pokémon donde puede crear un caterpy, un squartle y un charmander.

# Solución propuesta

![alt text](https://raw.githubusercontent.com/lbgutierrez/curso-jee-julio/master/documentacion/ejercicios-resueltos/sesion-1/DC_Pokemon.png)
