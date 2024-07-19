# Microservicio Template en Java y Spring Boot

Este repositorio es un template para crear microservicios en Java utilizando Spring Boot. Está diseñado para ser utilizado como base para nuevos proyectos, permitiendo al equipo de desarrollo y DevOps copiar la estructura y configuraciones necesarias para iniciar rápidamente nuevos microservicios.

## Tecnologías Utilizadas

- **Java 21**
- **Spring Boot**
- **Gradle**
- **MapStruct v1.5.5.Final**
- **Spring Data v3.3.1**

## Estructura del Proyecto

La estructura del proyecto sigue las mejores prácticas para la organización de un microservicio en Java y Spring Boot:

- **Controller**: Contiene los controladores REST.
- **Service**: Contiene la lógica de negocio.
- **Repository**: Contiene los repositorios para interactuar con la base de datos.
- **Entity**: Contiene las entidades de JPA.
- **DTO**: Contiene los objetos de transferencia de datos.
- **Mapper**: Contiene las interfaces de MapStruct para mapear entre DTO y Entity.

## Configuración del Proyecto

### Gradle

El proyecto utiliza Gradle como herramienta de construcción. Asegúrate de tener Gradle instalado en tu máquina. Para compilar y ejecutar el proyecto, puedes usar los siguientes comandos:

```sh
./gradlew build
./gradlew bootRun
```

## Estructura de Directorios
```
src
├── main
│   ├── java
│   │   └── com
│   │       └── deacero
│   │           ├── controller
│   │           ├── service
│   │           ├── repository
│   │           ├── entity
│   │           ├── dto
│   │           └── mapper
│   └── resources
│       └── application.yml
├── test
│   ├── java
│   │   └── com
│   │       └── deacero
│   │           ├── integration
│   │           └── unit
│   └── resources
│       └── application-test.yml
└── build.gradle
```

## Buenas Prácticas
Este proyecto utiliza herramientas de análisis de código para asegurar la calidad y consistencia del código. Las herramientas configuradas son:

- Checkstyle: Asegura que el código sigue las convenciones de codificación.
- PMD: Analiza el código para encontrar posibles errores y malas prácticas.
- Spotless: Formatea el código según las reglas definidas.

Para ejecutar estas herramientas, puedes usar los siguientes comandos:

```sh
./gradlew checkstyleMain
./gradlew pmdMain
./gradlew spotlessApply
```

## Prerequisitos

Para ejecutar este microservicio en un ambiente local en macOS, asegúrate de cumplir con los siguientes prerequisitos:

- Instalar Java 21: Descarga e instala Java 21 desde el sitio oficial de Oracle o utiliza un manejador de versiones de Java como SDKMAN!.
- Instalar Gradle: Descarga e instala Gradle desde el sitio oficial de Gradle o utiliza SDKMAN!:
- Activar el Annotation Processor en IntelliJ: Para habilitar el procesador de anotaciones de MapStruct en IntelliJ, sigue estos pasos:
```
Abre tu proyecto en IntelliJ IDEA.
Ve a IntelliJ IDEA -> Preferences -> Build, Execution, Deployment -> Compiler -> Annotation Processors.
Asegúrate de que la opción "Enable annotation processing" esté marcada.
```




