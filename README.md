# Taller de algoritmos y estructuras de datos

Este repositorio contiene ejercicios de programación en Java correspondientes al taller de algoritmos y estructuras de datos.

## Estructura del proyecto

- `Cont de frecuencias de letras en las palabras/`
  - `Exc2.java`: programa principal que lee una palabra y calcula la frecuencia de sus letras.
  - `Conteo.java`, `Diccionario.java`: clases auxiliares para el conteo y manejo de diccionario.

- `Lista doblemente enlazada/`
  - `PrincipalListaDoblementeEnlazada.java`: programa principal que prueba una lista doblemente enlazada.
  - `ListaDoblementeEnlazada.java`: implementación de la lista doblemente enlazada.
  - `NodoDeListaDoblementeEnlazada.java`: definición de nodo para la lista.
  - `Producto.java`: clase de datos usada en los ejemplos.

- `Ordenamiento QuickSort/`
  - `MainOrdenarEquipo.java`: clase principal que crea y ordena un arreglo de equipos.
  - `quickSortTP4.java`: implementación del algoritmo QuickSort.
  - `Equipo.java`: clase de datos para los elementos que se ordenan.

- `Pila, cola, y cola enlazada/`
  - Contiene clases compiladas (`.class`) relacionadas con pilas y colas.
  - No se encontró código fuente `.java` en esta carpeta dentro del repositorio.

## Descripción de los ejercicios

1. **Conteo de letras**
   - Lee una palabra desde la entrada estándar.
   - Convierte la entrada a mayúsculas.
   - Cuenta la frecuencia de cada letra del alfabeto.
   - Muestra un mensaje de error cuando el carácter no es una letra válida.

2. **Lista doblemente enlazada**
   - Construye una lista doblemente enlazada de objetos `Producto`.
   - Inserta productos en orden y maneja intentos de inserción de elementos duplicados.
   - Lista los productos almacenados.

3. **QuickSort**
   - Ordena un arreglo de objetos `Equipo` usando QuickSort.
   - Muestra los datos antes y después del ordenamiento.

4. **Pila y cola**
   - Ejercicios de estructuras de datos de pila, cola y cola enlazada.
   - El código fuente no está disponible en el repositorio actual; solo hay archivos compilados.

## Cómo ejecutar

1. Abrir una terminal en la raíz del proyecto.
2. Compilar los ejemplos disponibles:

```powershell
javac "Cont de frecuencias de letras en las palabras\*.java"
javac "Lista doblemente enlazada\*.java"
javac "Ordenamiento QuickSort\*.java"
```

3. Ejecutar una clase principal:

```powershell
java -cp "Cont de frecuencias de letras en las palabras" Exc2
java -cp "Lista doblemente enlazada" PrincipalListaDoblementeEnlazada
java -cp "Ordenamiento QuickSort" MainOrdenarEquipo
```

> Nota: Para `Pila, cola, y cola enlazada` solo hay archivos `.class` en el repositorio actual.

## Recomendaciones

- Si deseas trabajar con el ejercicio de `Pila, cola, y cola enlazada`, revisa si el código fuente `.java` está disponible en otro lugar o pide al autor que agregue las fuentes.
- Mantén la estructura de carpetas para que los comandos de compilación alcancen los archivos correctamente.
