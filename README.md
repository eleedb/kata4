# Kata 4
__Autora__: Elena Díaz Batista  
__Enlace a video explicativo__: https://drive.google.com/file/d/1XYghI2ZZR99SGy3yYWePEu_A0Mq-RmAN/view?usp=sharing

---

## 1. Objetivo de la entrega
El objetivo principal de esta kata es entender las URL como frontera de comunicación con un servicio HTTP
y construir un cliente pequeño separando la interfaz de pedida de operación, el puerto servicio que comunica
lo que necesita la aplicación, el adaptador que ejecuta la petición, el parser y la presentación del resultado.

---

## 2. Requisitos y configuración
### Dependencias y entorno de desarrollo
__JDK__: Oracle OpenJDK 25.0.1  
__IDE Recomendado__: IntelliJ IDEA  
__Sistema de Construcción__: Maven  
__Sistema de Control de Versiones__: Git  
__depencias usadas__: gson versión 2.15.0 y javalin versión 7.2.4

### Paquete base
El código fuente se encuentra en el paquete:   
software.ulpgc.katas

---

## 3. Estructura del proyecto y clases principales
Dentro del paquete principal software.ulpgc.katas nos encontramos dos paquetes:
### architecture
- __Paquete domain__: contiene la interfaz UseCase y la clase CalculateFibonacciSeriesUseCase 
- __Paquete model__: contiene la clase Series que representa una serie y sus operaciones
- __Paquete ports__: contiene las interfaces Input, Output y SeriesSerializer usadas para representar entradas, salidas y serializadores de series

### infrastructure
- __Paquete adapters__: contiene las clases JavalinContextInput que se usará para obtener la información de entrada, y JsonSeriesSerializer que serializa una serie usando Gson
- - __Clase Main__: usa Javalin obteniendo una entrada, procesándola y proporcionando una salida
---

## 4. Compilación y ejecución
Desde IntelliJ IDEA:
1. Abrir la carpeta raíz kata3 en IntelliJ IDEA.
2. Navegar a src/main/java/software/ulpgc/katas/infrastructure/Main.java 
3. Ejecutar la clase utilizando el icono de ejecución del entorno.

---

## 6. Flujo Git y repetición
La kata se ha repetido 3 veces, visibles en las distintas ramas develop_numeroDeRepeticion

---

## 7. Verificación de funcionamiento



