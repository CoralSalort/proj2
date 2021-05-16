
# Proyecto 2: Rummy
**Nombre:** Coral M. Salort Nogueras
**ID de estudiante:** 801-15-8112
**Curso:** CCOM4029 - Lenguajes de Alto Nivel
**Profesora:** Patricia Ordóñez

- - - -

### Descripción
Este proyecto es un GUI interactivo de una versión de Rummy simplificada.


### Colaboración
Este proyecto se realizó en su mayoría con la ayuda y compañía de Miguel Hernández, y algunos tips y consejos de Víctor Hernández.


### Instrucciones para lanzar el juego
Para correr el códico, ubíquese en el directorio donde se encuentra el folder del proyecto, y corra las siguientes lineas:

```
javac Proj2.java
java Proj2
```

Esto lanzará una pantalla con la interface de usuario.


### Cómo jugar
Para reglas generales del juego, puede referirse a algún website con las reglas. Solo considere que esta implementación se limita al reconocimiento de sets, no de runs. [Rummy (Rum)– Card Game Rules | Bicycle Playing Cards](https://bicyclecards.com/how-to-play/rummy-rum/)


### Funcionalidad

**Botones**
* Deck: Coge una carta del tope del deck
* Stack: Coge una carta de la pila de descarte
* Lay: Identifica un set y lo descarta de la mano
* Lay on Stack: Descarta una carta de la mano para acabar el turno

**Terminal**
El terminal lleva cuenta del contenido de las manos. Al culminar el juego, el terminal indica si ganó Player 1, Player 2 o si es un empate.