# Backend_CRUD_SpringBoot
Desarrollo de un servicio RESTFul CRUD API empleando Springboot como herramienta de desarrllo para Backend, uso de JPA y conexión con MySQL como DB.

## Requerimientos 

El proyecto requiere

1. IDE para manejo de proyectos maven SpringBoot (NetBeans, SST4, VSC)
2. MySQL 
3. Navegador (Chrome)

El proyecto se desarrolló con las siguientes versiones

1. JDK - 11.0.2
2. Maven - 2.7.3
3. Java - 11
3. MySQL - 8


## PUESTA EN MARCHA

**1. Clonar el repositorio en el IDE de preferencia**

```bash
git clone https://github.com/SDavidT/Backend_CRUD_SpringBoot.git
```

**2. Crear una base de datos libreria**
 
Cargar el archivo .sql


**3. Cambiar el usuario y contraseña para conexión con el DB**

+ Ubicarse en `src/main/resources/application.properties`

+ cambiar `spring.datasource.username`  
+ cambiar `spring.datasource.password` 

**4. Construir y correr el proyecto Maven**

Ejecutar el comando siguiente en consola

```bash
.\mvnw spring-boot:run
```

Acceder atraves de  <http://localhost:8080/api/libros>.

## Pruebas del CRUD

Se recomienda el uso de PostMan como plataforma de testeo de la API

Para lectura de datos del DB
   + GET /api/libros
    
Para borrar un registro del DB
   + DELETE /api/libros/{Id}

Para guardar un registro del DB
   + POST /api/notes
    
Para actualizar un registro del DB
   + PUT /api/notes/{noteId}
    
