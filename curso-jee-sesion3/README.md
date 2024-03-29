# El problema
Una persona tiene diferentes órganos que trabajan simultáneamente, tales como Pulmón para respirar y Corazón para bombear sangre. Para ello se debe implementar una clase llamada Corazón que implementa la interfaz Runnable para bombear sangre y la clase Pulmón que implementa la interfaz Runnable para respirar.

El corazón late cada 1 segundo mientras que la respiración es cada 4 segundos.

# Solución propuesta

![Diagrama de clase - Persona](https://github.com/lbgutierrez/curso-jee-julio/blob/master/documentacion/ejercicios-resueltos/sesion-3/DC-Persona-Thread.png?raw=true)

  1. La persona puede tener dos órganos, representados por las clases Corazon y Pulmón.
  
  2. Cada órgano funciona de forma independiente y para ello se implementará la interfaz Runnable para crear un proceso independiente por cada órgano.
  
  3. Cada organo funciona en una frecuencia distinta, por lo tanto es la clase persona la encargada en estipular la frecuencia (en segundos) en que opera cada uno. A su vez, si la persona muere, debe detener el funcionamiento de los organos, por medio del estado de cada uno.
  
  4. La clase encargada de inicializar a la persona es StartPersona, por medio del metodo principal (main).

![Diagrama de secuencia](https://github.com/lbgutierrez/curso-jee-julio/blob/master/documentacion/ejercicios-resueltos/sesion-3/DS-Persona-Thread.png?raw=true)

  1. La clase que inicia el programa será StartPersona.java, esta creará una instancia de la clase Persona y llamará a su metodo nacer()
  
  2. Al instante que se instancia la clase persona, se crea la instancia de Corazon y Pulmon, luego cuando se le indique al objeto persona que debe nacer, este iniciará los procesos de los organos Corazon y Pulmon de forma simultanea por medio de hilos.
  
  3. Cuando la persona muera, se debe llamar al metodo morir() y este actualizará el estado del organo, provocando que se finalice el hilo.
  