# Alma API

Alma API es un proyecto de API RESTful desarrollado con Spring Boot. Esta API permite gestionar datos utilizando JPA y MySQL, y proporciona documentación automática con Swagger.

## Características

- **Spring Boot**: Framework principal para el desarrollo de la API.
- **JPA**: Gestión de datos utilizando Java Persistence API.
- **MySQL**: Base de datos relacional para el almacenamiento de datos.
- **Swagger**: Documentación automática y fácil de usar para la API.
- **Lombok**: Reducción de código boilerplate con anotaciones útiles.
- **DevTools**: Herramientas de desarrollo para facilitar el desarrollo y la depuración.
- **Testing**: Incluye dependencias para pruebas unitarias y de integración.

## Requisitos

- Java 17
- Maven 3.6+
- MySQL

## Configuración

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu-usuario/alma-back.git
    cd alma-back
    ```

2. Configura la base de datos en `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. Construye el proyecto con Maven:

    ```bash
    mvn clean install
    ```

4. Ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

## Uso

Una vez que la aplicación esté en ejecución, puedes acceder a la documentación de la API en: http://localhost:8090/swagger-ui.html

El proyecto utiliza las siguientes dependencias:

- `spring-boot-starter-data-jpa`
- `spring-boot-starter-web`
- `springdoc-openapi-starter-webmvc-ui`
- `spring-boot-devtools`
- `mysql-connector-j`
- `lombok`
- `spring-boot-starter-test`

## Estructura del Proyecto

- `src/main/java/com/alma`: Código fuente principal de la aplicación.
- `src/main/resources`: Recursos de la aplicación como archivos de configuración.
- `src/test/java/com/alma`: Pruebas unitarias e integración.

