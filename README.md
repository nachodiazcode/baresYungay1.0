## Proyecto Bares Yungay

El proyecto "Bares Yungay" es una aplicación desarrollada completamente en Java que permite la búsqueda de bares ubicados en el barrio Yungay de Santiago, Chile. La aplicación está diseñada para ejecutarse en consola y tiene como objetivo proporcionar información relevante sobre los bares disponibles en esta zona específica.

### Estructura de Carpetas

El proyecto está estructurado de la siguiente manera:

- `src`: Contiene los archivos fuente en Java.
- `lib`: Almacena bibliotecas externas o dependencias (si las hubiera).
- `bin`: Carpeta destino para los archivos compilados.



Cualquier personalización adicional de la estructura de carpetas se puede gestionar a través de `.vscode/settings.json`.

## Dependencias

El proyecto está desarrollado íntegramente en Java, sin dependencias externas.

## Componentes

### 1. Funcionalidad de Búsqueda

#### Descripción

Este componente administra las operaciones de búsqueda de bares en el barrio Yungay.

#### Detalles de Implementación

- `Busqueda.java`: Clase Java que maneja la funcionalidad de búsqueda.
- `BarAPI.java`: Integración con una API externa para obtener detalles de los bares (si aplicable en futuras versiones).

### 2. Interfaz de Usuario (UI)

#### Descripción

El componente de la interfaz de usuario facilita las interacciones del usuario y muestra los resultados de búsqueda en la consola.

#### Detalles de Implementación

- `Main.java`: Punto de entrada principal de la aplicación que gestiona la interacción con el usuario y la lógica de búsqueda.

## Directrices de Desarrollo

### Estándares de Codificación

El proyecto sigue los estándares de codificación de Java, siguiendo las convenciones de nombres y buenas prácticas de programación.

### Contribuciones

- Se anima a la colaboración para el mejoramiento del proyecto. Para cambios significativos, se debe abrir un issue para discutirlos antes de realizarlos.
- Para contribuir, se sugiere crear una nueva rama para cada nueva funcionalidad o mejora.

### Compilación y Ejecución

- Para compilar el proyecto, ejecuta `javac -d bin src/*.java`.
- Para ejecutar la aplicación, usa `java -cp bin Main`.

## Conclusión

Este documento proporciona una descripción general del proyecto "Bares Yungay" desarrollado completamente en Java. Para obtener detalles más específicos sobre la implementación, se sugiere consultar los archivos y documentación dentro del proyecto.