# DISEÑO ARQUITECTÓNICO Y PATRONES #
# PRÁCTICA 4 #
### Orlandy Ariel Sánchez Acosta ###
Realice una aplicación que muestra el funcionamiento de un semáforo. Este semáforo funcionará también para invidentes, de manera que no solo muestre la luz sino también emita sonidos diferentes en función de los colores.
El funcionamiento del semáforo será el siguiente:

El semáforo permanecerá en rojo 10 segundos, a continuación pasará a ámbar 3 segundo y finalmente a verde durante 10 segundos. El semáforo en verde parpadeará más rápido al igual que su sonido durante 3 segundos antes de volver a rojo.
![Imagen semáforo](http://www.indemnizaciongolpe.es/wp-content/uploads/2013/04/parado_semaforo_accidente.jpg)

La entrega consistirá en una carpeta comprimida que contenga el código fuente y un informe explicando el patrón utilizado, por qué considera que es ese el patrón que debe utilizar, explicación de como se ha diseñado la práctica de manera que permita a otros desarrolladores entenderla con facilidad y el diagrama UML de dicha práctica.

#### Rúbrica: ####

* Utiliza correctamente el/los patrones adecuados. 5 ptos
* Diseña interfaz. 2 ptos.
* Cambio de estado en el contexto 2 ptos
* Informe con todo lo solicitado 1 pto.

## Patrón Estado ##
* **Clasificación:** Comportamiento de Objetos
* **Intención:** Alterar el comportamiento de un objeto según el estado interno en que se encuentre.
* **Participantes:**
  * Contexto:
      * Define la interfaz de interés para los clientes.
      * Mantiene una instancia de una subclase de EstadoConcreto que define el estado actual.
  * Estado:
      * Define una interfaz para encapsular el comportamiento asociado con un determinado estado del contexto.
  * Subclases EstadoConcreto:
      * Cada suclase implementa su comportamiento asociado con un estado del contexto.
