# Pilas Estáticas y Dinámicas en Java

## Datos de la práctica

- **Materia:** Estructura de Datos
- **Unidad:** 3
- **Práctica:** Pilas Estáticas y Dinámicas en Java
- **Docente:** Víctor Hugo Vásquez Herrera
- **Alumna:** Yajahira Germayoni Aguilar Hernádez
- **Institución:** Instituto Tecnológico Superior de Xalapa
- **Carrera:** Ingeniería en Sistemas Computacionales

## Introducción

El objetivo de esta práctica es implementar y comprender el funcionamiento de las pilas estáticas y dinámicas utilizando el lenguaje de programación Java. Se aplican operaciones para insertar, extraer, consultar y mostrar elementos.

## ¿Qué es una pila?

Una pila es una estructura de datos que utiliza el principio LIFO (Last In, First Out), que significa que el último elemento en entrar es el primero en salir.

Por ejemplo, si insertamos los números 10, 20 y 30, el primero en salir será el 30.

## Pila estática

La clase `PilaSimple.java` utiliza un arreglo de tamaño fijo. Su capacidad se establece al crear la pila y no puede superarse.

Métodos principales:

- `push(int valor)`: inserta un elemento.
- `pop()`: extrae el elemento superior.
- `mostrar()`: imprime los elementos.
- `isEmpty()`: verifica si está vacía.
- `isFull()`: verifica si alcanzó su capacidad máxima.
- `peek()`: consulta el elemento superior sin eliminarlo.

## Pila dinámica

La clase `PilaDinamica.java` utiliza nodos enlazados. Cada nodo almacena un valor y una referencia al siguiente nodo.

Métodos principales:

- `push(int valor)`: inserta un nodo.
- `pop()`: extrae el nodo superior.
- `mostrar()`: recorre e imprime los nodos.
- `isEmpty()`: verifica si no hay nodos.
- `peek()`: consulta el elemento superior sin eliminarlo.

La pila dinámica no utiliza `isFull()`, ya que no tiene una capacidad fija; su crecimiento depende de la memoria disponible.

## Diferencias entre ambas pilas

| Característica | Pila estática | Pila dinámica |
|---|---|---|
| Almacenamiento | Arreglo | Nodos enlazados |
| Capacidad | Fija | Variable |
| Memoria | Reservada para el arreglo | Se asigna conforme se insertan nodos |
| Acceso a la cima | Mediante índice | Mediante referencia |
| Control de capacidad | Utiliza `isFull()` | No utiliza `isFull()` |

## Archivos del proyecto

- `PilaSimple.java`: implementación de la pila estática.
- `PilaDinamica.java`: implementación de la pila dinámica.
- `Main.java`: programa principal para probar ambas pilas.

## Cómo compilar y ejecutar

Se requiere tener instalado el JDK de Java.

1. Descargar o clonar el repositorio.
2. Abrir una terminal en la carpeta donde se encuentran los archivos.
3. Compilar los archivos con:

```bash
javac PilaSimple.java PilaDinamica.java Main.java
```

4. Ejecutar el programa con:

```bash
java Main
```

## Prueba de ejecución

El programa inserta y muestra elementos en ambas pilas, consulta el elemento superior con `peek()`, extrae un elemento con `pop()` y verifica el estado de la pila.

En la pila estática se intenta insertar un cuarto elemento cuando la capacidad es de tres, por lo que se muestra el mensaje de pila llena.

En la pila dinámica se insertan tres elementos y se extrae el que se encuentra en la cima.

**Nota:** la salida real de la consola deberá comprobarse ejecutando el programa. Se recomienda copiarla y pegarla aquí dentro de un bloque de código Markdown.

## Conclusión

La práctica permite comprender el principio LIFO y las diferencias entre el almacenamiento estático y dinámico. La pila estática ofrece una capacidad definida, mientras que la dinámica puede crecer según las necesidades y la memoria disponible. Ambas permiten organizar y manipular datos mediante operaciones de inserción, extracción y consulta.
