## Objetivos del TP grupal

[![Build Status](https://travis-ci.org/sirDemian/eis_201801c_tp_grupal.svg?branch=master)](https://travis-ci.org/sirDemian/eis_201801c_tp_grupal)

Ejercitar la escritura de código en ambientes colaborativos utilizando una metodología de diseño guiada por pruebas ejecutanto un flujo de trabajo que facilite la integración frecuente de código.

### Lo que se espera

1. Implementar ATDD como técnica de diseño.  
2. Implementar FeatureBranch + Forking como flujo de trabajo, creando para esto un repositorio público con cualquier servicio de versionado de fuentes (Bitbucket, GitHub, etc.)
3. Cada cambio necesita ser integrado con la mayor frecuencia posiblie, utilizando para la verificación de este un servicio de CI (Continous Integration).
4. Generar el modelo tal que cumpla con las _Pruebas de Aceptación_ para el problema listado en la próxima sección (_Pacman_).
5. Completar tados de los integrantes del grupo utilizando este archivo (```README.md```)

### Feedback

- [X] (1) Ok.
- [X] (2) Ok.
- [ ] (3) **No se puede evaluar porque no se ejecutaban las pruebas de aceptación.**
- [X] (4) Ok.
- [X] (5) Ok.

Ver [stats][1] de colabroación.

NOTA: 7.

### Integrantes


Nro | Nombre                    | Legajo | Mail
----|---------------------------|--------|------
1   | Emanuel Salgado           | 16659  | salgadoema@gmail.com
2   | Rigazio Damian            | 28621  | sirdemian@gmail.com
3   | Paula Schab               | 28688  | schabpaula@gmail.com
4   | Pablo Nicolas Sabaliauskas| 28662  | sabaliauskaspablo@gmail.com
5   | Maricruz Gil              | 27206  | gil.maricruz@gmail.com

### Entrega

16 / 05 / 2018

## Pacman

El objetivo de este ejercicio es implementar parcialmente el modelo del juego [Pacman][2] siguiendo los criterios listados en la sección Objetivos.

### Pruebas de aceptación

1. Pacman come un biscuit se vuelve más gordo (suma puntos).
2. Pacman come una fruta se vuelve más gordo (suma puntos).
3. Pacman choca contra un fantasma y muere.
4. Pacman come un pellet y los fantasmas se debilitan.
5. Pacman choca contra un fantasma debilitado y no muero. Adicionalmente la digestión es el fantasma sin cuerpo.
6. Pacman choca contra un fantasma sin cuerpo y no muere.
7. Pacman come una fruta especifica y vuela, pasa por arriba de los fantasmas y no muere. 
   Dura una determinada cantidad de tiempo. 

[1]: https://travis-ci.org/
[2]: https://en.wikipedia.org/wiki/Pac-Man
